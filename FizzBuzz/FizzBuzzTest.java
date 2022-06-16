package BaiTap9;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    @DisplayName("CheckNumberDivThree")
    void checkNumberDivThree() {
        int a = 3;
        String expected = "Fizz";
        String result = FizzBuzz.checkNumberDivThree(a);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("CheckNumberDivFive")
    void checkNumberDivFive() {
        int a = 5;
        String expected = "Buzz";
        String result = FizzBuzz.checkNumberDivFive(a);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("CheckNumberDivThreeAndFive")
    void checkNumberDivThreeAndFive() {
        int a = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.checkNumberDivThreeAndFive(a);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("CheckNumberContainThree")
    void checkNumberContainThree() {
        String a = "Three";
        String expected = "Fizz";
        String result = FizzBuzz.checkNumberContainThree(a);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("CheckNumberContainFive")
    void checkNumberContainFive() {
        String a = "Five";
        String expected = "Buzz";
        String result = FizzBuzz.checkNumberContainFive(a);
        assertEquals(expected, result);
    }
}