package TestCases;

public class MissingNumber {

	public static void main(String[] args) {
		//finding missing number from sequential Array and sorted array.
		//it should be in sorted order and in sequential order.
		int a[]= {1,2,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum=sum+a[i];
		int sum1=0;
		for(int j=0;j<=5;j++)
			sum1=sum1+j;
		System.out.println("The missing number from array is: "+(sum1-sum));
		
	}

}
