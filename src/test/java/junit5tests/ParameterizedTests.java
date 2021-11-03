package junit5tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTests {

    @DisplayName("Print int values")
    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(ints = {1, 2, 3})
    void intValues(int theParam) {
        System.out.println("theParam = " + theParam);
    }

    @DisplayName("Print string values with one empty value")
    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @NullAndEmptySource
    @ValueSource(strings = {"first","second"})
    void stringValues(String theParam){
        System.out.println("theParam = " + theParam);
    }
}
