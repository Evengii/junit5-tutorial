package junit5tests;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestOrderDemo {
    //test demonstrates ordering of tests by method names alphanumerically

    @BeforeEach
    void beforeEach(){
        System.out.println("----This is the before Each method");
    }
    @AfterAll
    void afterAll(){
        System.out.println("--This is the after All method");
    }

    @Test
    void firstMethod(){
        System.out.println("The first test");
    }

    @DisplayName("US1 TC1 - these tests about Lifecycle methods")
    @Test
    void asecondMethod(){
        System.out.println("The second test");
    }
}
