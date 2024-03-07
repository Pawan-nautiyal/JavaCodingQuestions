package TestCases;

public class StringContainsOnlyDigits {
	//write down the ascii value first
	public static boolean contain_digit(String str)
	{
		if (str==null||str.length()==0)
			return false;
		for (int i=0;i<str.length();i++)
		{
			int asci=(int) str.charAt(i);
			if(asci>=48&&asci<=57)
				return true;
			
		}
		return false;
	}
	

	public static boolean contain_digit_regex(String str)
	{
		if (str==null||str.length()==0)
			return false;
		boolean checkalphanumeric=str.matches("^(?=.*[a-zA-Z])(?=.*[0-9])[a-z,A-Z,0-9]+$");
		if (checkalphanumeric)
			return true;
		else
			return false;
	}
	
	
	public static boolean contain_digit_wrapperclass(String str)
	{
		if (str==null||str.length()==0)
			return false;
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				return true;
			}
		}
		return false;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(contain_digit_regex("ABC01"));
		System.out.println(contain_digit_regex("apwan"));
		System.out.println(contain_digit("8768789"));
		System.out.println(contain_digit("apwan"));
		System.out.println(contain_digit(")89739287"));
		System.out.println(contain_digit("*#&"));
		
		System.out.println(contain_digit_wrapperclass("shjdas1da"));
		System.out.println(contain_digit_wrapperclass("*&^*&^&*"));
		System.out.println(contain_digit_wrapperclass(")08*^*&KJHKj"));
		
	}

}
