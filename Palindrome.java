package com.company;

public class Palindrome {

    public static void main(String[] args) {
	String word1 = "Racecar";
    String word2 = "Plane";
	System.out.println("Is '" + word1 + "' a Palindrome: " + checkPalindrome(word1));
    System.out.println("Is '" + word2 + "' a Palindrome: " + checkPalindrome(word2));
    }

    public static boolean checkPalindrome(String word)
    {
        boolean result = true;
        word = word.toLowerCase();
        for(int i = 0; i < word.length()/2; i++)
        {
            if(word.charAt(i) != word.charAt(word.length()-1-i))
            {
                result = false;
            }
        }
        return result;
    }
}
