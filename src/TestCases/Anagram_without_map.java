package TestCases;

import java.util.HashMap;
import java.util.Map;

public class Anagram_without_map {
	/*
	 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:

Input: s = "rat", t = "car"
Output: false

	 */

	public static void main(String[] args) {
		
		String s="anagram";
		String t="nagaram";
		if(is_anagram(s,t))
			System.out.println("The String is Anagram");
		else
			System.out.println("The String is not Anagram");

	}
	public static boolean is_anagram(String s, String t)
	{


        if(s.length()!=t.length())
            return false;
        int ar[]=new int[26];
        for(int i =0;i<s.length();i++)
        {
             ar[s.charAt(i)-'a']++;
             ar[t.charAt(i)-'a']--;
                 
        }
        for(int i =0;i<26;i++)
        {
            if(ar[i]!=0)
                return false;
        }
        return true;

	}


}
