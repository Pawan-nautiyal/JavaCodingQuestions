package TestCases;
/****description
 @author Pawan Nautiyal
 For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
*/


public class GreatestCommonDivisorString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="ABCABC";
		String str2="ABC";
		System.out.println(gcdOfStrings(str1,str2));
		

	}

	 public static String gcdOfStrings(String str1, String str2) {
	        if(str1.length()<str2.length())
	            return gcdOfStrings(str2,str1);

	        if(str2.equals(str1))
	            return str1;
	        if(str1.startsWith(str2))
	            return gcdOfStrings(str1.substring(str2.length()),str2);
	        return "";
	    }
}
