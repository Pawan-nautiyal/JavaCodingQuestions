package Two_pointers;

public class is_subsequence {
/*
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false

 
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		String s="abc";
		String t= "ahbgdc";
		System.out.println("The String s is subsequence of t : "+ check_subsequence(s,t));
	}
	 	
	public static boolean check_subsequence (String s, String t) {
		
		if(s.length()>t.length())
			return false;
		int i =0;
		int j=0;
		while(i<s.length()&&j<t.length())
		{
			if(s.charAt(i)==t.charAt(j))
				i++;
			j++;
		}
		
		if (i==s.length())
			return true;
		else
			return false;
		
		
}
}