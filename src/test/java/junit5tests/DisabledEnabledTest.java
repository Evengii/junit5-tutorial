package junit5tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class DisabledEnabledTest {

    @Test
    @Disabled
    void firstTest(){
        System.out.println("First test");
    }

    @Test
    @DisabledOnOs(value = OS.WINDOWS, disabledReason = "Disabled for demo of @DisabledOnOs")
    void secondTest(){
        System.out.println("second test");
    }

    @Test
    @EnabledOnOs(value = OS.LINUX, disabledReason = "Disabled for demo of @EnabledOnOs")
    void thirdTest(){
        System.out.println("third test");
    }

    @Test
    //@DisabledIfSystemProperty("Changed property blabla")
    void forthTest(){
        System.out.println("forth test");
    }

    @Test
    @DisabledIf(value = "provider", disabledReason = "Disabled for demo of @DisabledIf")
    void fifthTest(){
        System.out.println("Fifth test");
    }

    boolean provider() {
        return LocalDateTime.now().getDayOfWeek().equals(DayOfWeek.SATURDAY);
    }

}
