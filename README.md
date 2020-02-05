# IntegerPalindrome

Problem 6: Integer Palindrome

Check if given Integer is palindrome or not. An integer is called palindrome if it's equal to its reverse, e.g. 1001 is a palindrome, but 1234 is not because the reverse of 1234 is 4321 which is not equal to 1234.
Please write the unit tests for your solution using any of the unit testing framework.

## Dependencies used
* JUnit 5.5.2 https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api

## Assumptions
1. null is a palindrome

## To Run
1. Run Main.main()

## Highlights
1. Works for odd and even length numbers (if under 10 digits long)
2. Works for single digits
3. .checkForPalindrome() only runs for loop as long as needed
   * Program does not run longer than needed
4. Program can easily beconverted to work with String inputs if needed

## Improvements
1. Could provide handling for null input 
   * decide whether null is a palindrome
2. Inputs cannot be longer than 10 digits due to limitations of Integer class
   * Could use Long input type to allow for longer inputs
3. Could allow negatie numbers to return true if absolutue value of input is a palindrome
