package TestCases;

public class reversewords {

	
	public static void main(String[] args) {
		//string.trim remove all the leading and trailing spaces from the string;
		//Reverse Words: Split the string into words, reverse the order of the words, and then join them back into a string.
		String sen= "    My name      is pawan nautiyal    ";
		
		reverse_words(sen);
		
		
		

	}
	public static void reverse_words(String str)
	{
		//str.trim();
		//String []sen =str.split("\\s+");
		String []sen=str.split("[ ]+");
		String ret="";
		for(int i=sen.length-1;i>=0;i--)
			ret=ret+sen[i]+" ";
			
		System.out.println("The reverse of words in string is: "+ret);
	}

}
