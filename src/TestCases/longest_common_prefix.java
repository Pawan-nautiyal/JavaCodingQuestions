package TestCases;
import java.util.*;
import java.util.Arrays;
/*
 Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

 */
public class longest_common_prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs []= {"flower","flow","flight"};
		System.out.println("The Longest Common Prefix is : " + longestcommonprefix(strs));

	}
	public static String longestcommonprefix(String[] strs)
	{
		StringBuilder Str= new StringBuilder();
		//sort the string first
		Arrays.sort(strs);
		
		//store first and last string character
		char ch1[]=strs[0].toCharArray();
		char ch2[]=strs[strs.length-1].toCharArray();
		for(int i =0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
				break;
			Str.append(ch1[i]);
		}
		return Str.toString();
	}

}
