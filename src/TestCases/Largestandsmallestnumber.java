package TestCases;

import java.util.Arrays;

public class Largestandsmallestnumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {0,-9838,98320984,9,309,-3298,-98};
		
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest)
				largest=arr[i];
			if(arr[i]<smallest)
				smallest=arr[i];
			
		}
		System.out.println("The array is :"+ Arrays.toString(arr));
		System.out.println("The Largest number is: "+largest);
		System.out.println("The Smallest Number is: "+smallest);

	}

}
