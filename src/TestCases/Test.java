package TestCases;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org="Pawan";
		char[]char_arr= org.toCharArray();
		int j=char_arr.length-1;
		
		for(int i =0; i<j ;i++)
		{
			char temp= char_arr[i];
			char_arr[i]=char_arr[j];
			char_arr[j]=temp;
			j--;
		}
		String rev= new String(char_arr);
		System.out.println("The reverse of string is: "+ rev);
		
		
	}

}
