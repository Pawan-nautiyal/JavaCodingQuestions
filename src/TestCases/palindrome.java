package TestCases;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int num1=121;
		int rev_num=0;
		String  str="aba";
		char ch[]=str.toCharArray();
		String rev="";
		num=num1;
		while (num>0)
		{
			int temp=num%10;
			rev_num=rev_num*10+temp;
			num=num/10;
		}
		
		if(num1==rev_num)
		{
			System.out.println("The number is palindrome ");
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
		for(int i=ch.length-1;i>=0;i--)
			rev=rev+ch[i];
		if(str.equals(rev))
			System.out.println("The string is palindrome");
		else
			System.out.println("The String is not palindrome");
		
	}

}


























