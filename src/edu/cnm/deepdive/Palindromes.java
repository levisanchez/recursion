package edu.cnm.deepdive;

public class Palindromes {

  public static boolean testRecursive(String input) {
//    boolean isPalindrome = false;
//    if (
//        input.length() <= 1
//        || (
//            input.charAt(0) == input.charAt(input.length() - 1)
//            && testRecursive(input.substring(1, input.length() - 1))
//        )
//    ) {
//      isPalindrome = true;
//    }
//    return isPalindrome;

    return input.length() <= 1
        || (
        input.charAt(0) == input.charAt(input.length() - 1)
            && testRecursive(input.substring(1, input.length() - 1))
    );
  }

  public static boolean testDenormalized(String inputTwo) {

    String inputThree = (inputTwo.replaceAll("[\\W_]+", ""));

  //public static boolean testRecursive(String input) {
//    boolean isPalindrome = false;
//    if (
//        input.length() <= 1
//        || (
//            input.charAt(0) == input.charAt(input.length() - 1)
//            && testRecursive(input.substring(1, input.length() - 1))
//        )
//    ) {
//      isPalindrome = true;
//    }
//    return isPalindrome;

    return inputThree.length() <= 1
        || (
        inputThree.charAt(0) == inputThree.charAt(inputThree.length() - 1)
            && testDenormalized(inputThree.substring(1, inputThree.length() - 1))
    );
   // return true;
  }

}
