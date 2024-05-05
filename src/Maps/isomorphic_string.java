package Maps;
import java.util.*;
/*
 Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"
Output: true

Example 2:

Input: s = "foo", t = "bar"
Output: false

Example 3:

Input: s = "paper", t = "title"
Output: true 
 * 
 */

public class isomorphic_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="egg";
		String t="add";
		if(isomorphic(s,t))
			System.out.println("The String is Isomorphic");
		else
			System.out.println("The String is not Isomorphic");
		

	}
	
	public static boolean isomorphic(String s,String t)
	{

        Map<Character,Character> m1= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(m1.containsKey(s.charAt(i))){
                if(m1.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }
            else{
                if(m1.containsValue(t.charAt(i)))
                    return false;
                m1.put(s.charAt(i),t.charAt(i));
            } 
                
        }
        return true;

	}

}
