package TestCases;
import java.util.*;
public class romantointeger {
/*
  Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.

Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
	public static void main(String[] args) {
		String str="MCMXCIV";
		System.out.println("The Integer of "+str+" roman number is : " +roman_integer(str));
	}
	public static int roman_integer(String str)
	{
		Map<Character,Integer> m1= new HashMap<>();
		m1.put('I',1);
		m1.put('V',5);
		m1.put('X',10);
		m1.put('L',50);
		m1.put('C',100);
		m1.put('D',500);
		m1.put('M',1000);
		int result=m1.get(str.charAt(str.length()-1));
		for(int i=str.length()-2;i>=0;i--)
		{
			int value=m1.get(str.charAt(i));
			int before_value=m1.get(str.charAt(i+1));
			if(before_value>value)
				result=result-value;
			else
				result=result+value;
			
		}
		return result;	
	}
}
