package BaiTap9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void getNextDay() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "02/01/2018";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }
}