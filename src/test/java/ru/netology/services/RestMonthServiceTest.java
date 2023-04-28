package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestMonthServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/income and expenses.csv")

    public void testRest (int expected, int income, int expenses, int threshold){
        RestMonthService service = new RestMonthService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
