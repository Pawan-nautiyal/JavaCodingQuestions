package Maps;
import java.util.*;

public class Anagram_using_map {

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
		// TODO Auto-generated method stub
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
        Map <Character,Integer> m1= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            m1.put(s.charAt(i),m1.getOrDefault(s.charAt(i),0)+1);

            m1.put(t.charAt(i),m1.getOrDefault(t.charAt(i),0)-1);
        }
        for(int value:m1.values())
        {
            if(value!=0)
                return false;
        }
        return true;
    
	}

}
