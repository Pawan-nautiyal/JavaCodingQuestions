package Maps;
import java.util.*;
/*
Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
 */

public class Word_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="abba";
		String s="dog cat cat dog";
		if(wordPattern(pattern,s))
			System.out.println("The String S follows the same pattern as in P");
		else
			System.out.println("The String S does not follows the same pattern as in P");
	}
	public static boolean wordPattern(String pattern,String s)
	{

        Map<Character,String> m1= new HashMap<>();
        String ar[]=s.split("\s+");
        if(pattern.length()!=ar.length)
            return false;
        
        for(int i=0;i<pattern.length();i++)
        {
            if(m1.containsKey(pattern.charAt(i)))
            {
                if(!m1.get(pattern.charAt(i)).equalsIgnoreCase(ar[i]))
                    return false;
            }
            else
            {
                if(m1.containsValue(ar[i]))
                    return false;
                m1.put(pattern.charAt(i),ar[i]);
            }
        }
        return true;
	}
	
	

}
