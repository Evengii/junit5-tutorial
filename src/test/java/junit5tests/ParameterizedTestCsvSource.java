package junit5tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ParameterizedTestCsvSource {

    @DisplayName("Parameterized Test with Csv Source")
    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @CsvSource(value = {"first,second", "third,fourth", "some values, sixth"})
    void csvSource_StringString(String param1, String param2){
        System.out.println("Param1 = " + param1 + ", param2 = " + param2);
    }

    @DisplayName("Parameterized Test with different arguments")
    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @CsvSource(value = {"first,1,true", "second,2,false", "third, 3, true"})
    void csvSourse_StringIntBoolean(String param1, int param2, boolean param3){
        System.out.println("Param1 = " + param1 + ", param2 = " + param2 + ", param3 = " + param3);
    }

    @DisplayName("Parameterized Test with specified delimeter")
    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @CsvSource(value = {"firstString1Stringtrue", "secondString2Stringfalse", "thirdString3Stringtrue"}, delimiterString = "String")
    void csvSourse_differentDelimeter(String param1, int param2, boolean param3){
        System.out.println("Param1 = " + param1 + ", param2 = " + param2 + ", param3 = " + param3);
    }

}
