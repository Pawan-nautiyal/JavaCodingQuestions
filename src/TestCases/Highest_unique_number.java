package TestCases;

import java.util.*;
public class Highest_unique_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to find highest unique element in array
		int ar[]= {0,2,322,332,322,322,2,3,2,766657};
	//using HashMap	
		HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
		
		for(int i=0;i<ar.length;i++)
		{
			if(data.containsKey(ar[i]))
				data.put(ar[i], data.get(ar[i])+1);
			else
				data.put(ar[i],1);
			
		}
		System.out.println(data);
		
		
		int high=Integer.MIN_VALUE;
		for (Integer i:ar)
		{
			if(data.get(i)==1) {
				if(i>high)
					high=i;
			}
				
		}
		System.out.println("Highest unique number is: "+high);
	}

}
