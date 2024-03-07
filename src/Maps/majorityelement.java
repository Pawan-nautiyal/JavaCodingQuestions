package Maps;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class majorityelement {
	/*
	 *Given an array nums of size n, return the majority element.

The majority element is the element that appears more than n /2 times. You may assume that the majority element always exists in the array.
	 Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

	 *
	 */
	public static void main(String[] args) {
		int nums[]= {2,2,1,1,1,2,2};
		System.out.println("The Majority of Array is : "+majority_element(nums));
		


	}
	public static int majority_element(int []arr)
	{
		Map<Integer,Integer> m1= new HashMap<>();
		for (int num: arr)
		{
			if(!m1.containsKey(num))
				m1.put(num, 1);
			else
				m1.put(num, m1.get(num)+1);
			if(m1.get(num)>(arr.length/2))
				return num;
		}
		return -1;
	}

}
