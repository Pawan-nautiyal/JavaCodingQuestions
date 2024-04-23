package Two_pointers;

public class valid_palindrome {
/*
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="A man, a plan, a canal: Panama";
		boolean check = ispalindrome(str);
		if (check)
			System.out.println("\nThe String is valid Palindrome");
		else
			System.out.println("\nThe String is not valid Palindrome");
		
		
	}
	public static boolean ispalindrome(String str)
	{
		str=str.toLowerCase().replaceAll("[^a-zA-z0-9]", "");
		int j=str.length()-1;
		int i=0;
		System.out.println("The string after replacing non alpanumeric character : " +str);
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;

	}

}




