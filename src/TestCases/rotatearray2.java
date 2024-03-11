package TestCases;

import java.util.Arrays;

public class rotatearray2 {
/*
 * Given an integer array num, rotate the array to the right by k steps, where k is non-negative.
Example 1:

Input: num = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: num = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 * 
 */
	
	
	public static void main(String[] args) {
		int [] num1= {1,2,3,4,5,6,7};
		int k=3;
		System.out.println(Arrays.toString(rotatearray(num1,k)));
		
	}
	public static int[] rotatearray(int [] num2, int k) {

		k%=num2.length;
		reverse(num2,0,num2.length-1);
		reverse(num2,0,k-1);
		reverse(num2,k,num2.length-1);
		return num2;
		
	
	}
	public static void reverse(int nums[],int start,int end)
	{
		while(start<end)
		{
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
	}
}
