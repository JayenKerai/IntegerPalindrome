package com.sparta.jk;

/*
- checks if a given string is a palindrome
- checkForPalindrome compares each character to the one opposite it
  - ie. compare digit[i] with digit[input.length - i]
 */
public class IntegerPalindromeChecker {

    public boolean checkForPalindrome(Integer input) {
        String str = input.toString(); //convert input to string to perform check
        for (int i = 0; i < (str.length() / 2); i++) { //only need to check first half against second half of input to be certain
            if (str.charAt(i) != (str.charAt(str.length() - 1 - i))) { //compare input[i] to input[length-i-1]
                return false; //if the input is not a palindrome, exit loop immediately and return false
            }
        }
        return true;
    }
}