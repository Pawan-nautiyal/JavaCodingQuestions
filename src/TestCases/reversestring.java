package TestCases;

public class reversestring {

	public static void main(String[] args) {
		//Reverse a string
		//difference between string and string buffer(string buffer is mutable it can be changed)
		//do we have a reverse function in string? No because string is immutable and string buffer is mutable, 
		
		String s="Hello World";
		String rev="";
		int len=s.length();
		
		for (int i=len-1;i>=0;i--)
			rev=rev+s.charAt(i);
		System.out.println("Reverse of String is: "+rev);
	
		//using string buffer
		StringBuffer sf= new StringBuffer(s);
		System.out.println("The Reverse of a string using string buffer function is : "+sf.reverse());
	
	}

}
