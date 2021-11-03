package junit5tests;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestOrderDemo2 {
    //test demonstrates ordering of tests by method names alphanumerically

    @BeforeEach
    void beforeEach(){
        System.out.println("----This is the before Each method");
    }
    @AfterAll
    void afterAll(){
        System.out.println("--This is the after All method");
    }

    @Order(2)
    @Test
    void firstMethod(){
        System.out.println("The first test");
    }

    @DisplayName("US1 TC1 - these tests about Lifecycle methods")
    @Order(1)
    @Test
    void asecondMethod(){
        System.out.println("The second test");
    }
}
