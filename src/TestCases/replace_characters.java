package TestCases;

public class replace_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="$#2#(**(&(*#Pawan)_Nautiyal^%&07";
		
		//For replacing and removing unwanted characters from the string we will be using Regx
		//[^a-zA-Z0-9]
		//^ means not this and exclude other than this
		str=str.replaceAll("[^a-z,A-Z]","");
		boolean check=str.matches("[a-z,A-z,0-9]");
		if(check)
			System.out.println("Cotains Alphanumeirc character");
		else
			System.out.println("Does not Cotains Alphanumeirc character");
		
			
			
		System.out.println(str);

	}

}
