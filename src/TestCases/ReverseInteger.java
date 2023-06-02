package TestCases;

public class ReverseInteger {

	public static void main(String[] args) {
		// Reverse Integer using algorithm
		long num= 12345;
		long rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println("The reverse of number is: "+rev);
		//using string buffer class
		long num2=12345;
		System.out.println(new StringBuffer(String.valueOf(num2)).reverse());
		
	}

}
