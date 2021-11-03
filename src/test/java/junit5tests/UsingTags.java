package junit5tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsingTags {

    @BeforeEach
    void beforeEach(){
        System.out.println("----This is the before Each method");
    }
    @AfterAll
    void afterAll(){
        System.out.println("--This is the after All method");
    }

    @Test
    @Tag("regular")
    void firstMethod(){
        System.out.println("The first test");
    }

    @DisplayName("US1 TC1 - these tests about Lifecycle methods")
    @Test
    @Tag("regular")
    void secondMethod(){
        System.out.println("The second test");
    }

    @DisplayName("Print int values")
    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(ints = {1, 2, 3})
    @Tag("parameterized")
    @Tag("regular")
    void intValues(int theParam) {
        System.out.println("theParam = " + theParam);
    }
}
