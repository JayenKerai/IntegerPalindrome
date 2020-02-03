package com.sparta.jk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIntegerPalindromeChecker {

    private IntegerPalindromeChecker integerPalindromeChecker = new IntegerPalindromeChecker();

    @Test
    public void TestThatValidEvenLengthPalindromeReturnsTrue() {
        Assertions.assertTrue(integerPalindromeChecker.checkForPalindrome(1001));
    }

    @Test
    public void TestThatValidOddLengthPalindromeReturnsTrue() {
        Assertions.assertTrue(integerPalindromeChecker.checkForPalindrome(10001));
    }

    @Test
    public void TestThatInvalidEvenLengthPalindromeReturnsFalse() {
        Assertions.assertFalse(integerPalindromeChecker.checkForPalindrome(1101));
    }

    @Test
    public void TestThatInvalidOddLengthPalindromeReturnsFalse() {
        Assertions.assertFalse(integerPalindromeChecker.checkForPalindrome(11001));
    }

    @Test
    public void TestThatSingleDigitNumberReturnsTrue() {
        Assertions.assertTrue(integerPalindromeChecker.checkForPalindrome(5));
    }

    @Test
    public void TestThatNullNumberReturnsTrue() {
        Assertions.assertTrue(integerPalindromeChecker.checkForPalindrome(null));
    }

    @Test
    public void TestMaxIntReturnsFalse() {
        Assertions.assertFalse(integerPalindromeChecker.checkForPalindrome(Integer.MAX_VALUE));
    }

    @Test
    public void TestMaxIntValueReturnsFalse() {
        Assertions.assertFalse(integerPalindromeChecker.checkForPalindrome(2147483647));
    }

    @Test
    public void TestMaxIntPlusOneHundredReturnsFalse() {
        Assertions.assertFalse(integerPalindromeChecker.checkForPalindrome(Integer.MAX_VALUE + 100));
    }

    @Test
    public void TestLongPalindromeCastAsIntReturnsTrue() {
        Assertions.assertTrue(integerPalindromeChecker.checkForPalindrome((int) 100000000000001L));
    }

    @Test
    public void TestNegativePalindromeReturnsTrue() {
        Assertions.assertTrue(integerPalindromeChecker.checkForPalindrome(-1001));
    }

    @Test
    public void TestThatFloatCastAsIntValidPalindromeReturnsTrue() {
     Assertions.assertTrue(integerPalindromeChecker.checkForPalindrome((int) 1000001F));
    }

    @Test
    public void TestThatFloatCastAsIntInvalidPalindromeReturnsFalse() {
     Assertions.assertFalse(integerPalindromeChecker.checkForPalindrome((int) 1100001F));
    }

}
