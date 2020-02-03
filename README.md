# IntegerPalindrome
Check if given Integer is palindrome or not

## To Run
1. Instantiate IntegerPalindromeChecker
2. Invoke IntegerPalindromeChecker.checkForPalindrome(Integer input)
   * Provide Integer input to method
   * .checkForPalindrome() returns true if the input was a palindrome, else it returns false

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
