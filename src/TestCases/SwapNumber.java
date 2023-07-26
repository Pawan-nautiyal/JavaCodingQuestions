package TestCases;

public class SwapNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5; //0101
		int y=10;//1010
		System.out.println("Before Swapping x:"+x+" and y:"+y);
		/*swap numbers without using 3rd variable using + operator
		x=x+y;
		y=x-y;
		x=x-y;
		*/
		/*swap using * operator
		x=x*y;
		y=x/y;
		x=x/y;
		*/
		//swap using xor operator
		x=x^y;//1111 ->15
		y=x^y;//0101 ->5
		x=x^y;//1010 ->10
		
		
		System.out.println("After Swapping x:"+x+" and y:"+y);
	}

}
