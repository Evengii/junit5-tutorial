package junit5tests;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class AssumptionsTest {
    @DisplayName("Print int values")
    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(ints = {1, 2, 3})
    void intValues(int theParam) {
        Assumptions.assumeTrue(theParam > 1);
        System.out.println("theParam = " + theParam);
    }

    @DisplayName("AssumeThat Assumption")
    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @CsvSource(value = {"1,first", "2,second", "3,third"})
    void intStringValues(int param1, String param2){
        Assumptions.assumingThat(param1 > 1, () -> System.out.println("The test was skipped because first param less than 1"));
        System.out.println("Test " + param1 + " is executed");
    }
}
