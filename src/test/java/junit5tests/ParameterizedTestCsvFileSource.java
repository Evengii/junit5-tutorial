package junit5tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ParameterizedTestCsvFileSource {

    @DisplayName("Test with single CSV file source")
    @ParameterizedTest(name = "Run: {index}, value: {arguments}")
    @CsvFileSource(files = {"src/test/resources/params/shoppinglist.csv", "src/test/resources/params/shoppinglist2.csv"}, numLinesToSkip = 1)
    void singlecsvFileSource_StringDoubleIntStringString(String name, double price,
                                                   int qty, String uom,
                                                   String provider){
        System.out.println("name = " + name + ", price = " + price +
                ", qty = " + qty + ", uom = " + uom + ", provider = " + provider);
    }

    @DisplayName("Test with few CSV files source")
    @ParameterizedTest(name = "Run: {index}, value: {arguments}")
    @CsvFileSource(files = {"src/test/resources/params/shoppinglist.csv", "src/test/resources/params/shoppinglist2.csv"}, numLinesToSkip = 1)
    void fewcsvFileSource_StringDoubleIntStringString(String name, double price,
                                                   int qty, String uom,
                                                   String provider){
        System.out.println("name = " + name + ", price = " + price +
                ", qty = " + qty + ", uom = " + uom + ", provider = " + provider);
    }

    @DisplayName("Test with specified delimiter file source")
    @ParameterizedTest(name = "Run: {index}, value: {arguments}")
    @CsvFileSource(files = "src/test/resources/params/shoppinglist3.csv", numLinesToSkip = 1, delimiter = '!')
    void specDelCsvFileSource_StringDoubleIntStringString(String name, double price,
                                                   int qty, String uom,
                                                   String provider){
        System.out.println("name = " + name + ", price = " + price +
                ", qty = " + qty + ", uom = " + uom + ", provider = " + provider);
    }
}
