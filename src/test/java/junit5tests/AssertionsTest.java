package junit5tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AssertionsTest {
    @BeforeAll
    void beforeAll(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver95.exe");
    }

    @Test
    void assertEquals(){
        Assertions.assertEquals("firstString","secondString", "Not equal");
    }

    @Test
    void assertEqualsLists(){
        List<String> expectedValues = Arrays.asList("firstString", "secondString", "thirdList");
        List<String> actualValues = Arrays.asList("firstString", "secondString", "thirdList");
        Assertions.assertEquals(expectedValues, actualValues);
    }

    @Test
    void assertEqualsInts(){
        int[] expectedValues = {1, 2, 3};
        int[] actualValues = {1, 2, 3};
        Assertions.assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    void assertThrow(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://develop.aerisatlas.com/#/login");
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            driver.findElement(By.id("mail")).click();
        }, "Element 'mail' is not found");
    }

    @Test
    void assertAllTest(){
        WebDriver driver = new ChromeDriver();
        Assertions.assertAll(
                () -> Assertions.assertEquals("firstString","secondString", "Not equal"),
                () -> Assertions.assertThrows(NoSuchElementException.class, () -> {
                    driver.findElement(By.id("mail")).click();
                }, "Element 'mail' is not found")
        );
    }
}
