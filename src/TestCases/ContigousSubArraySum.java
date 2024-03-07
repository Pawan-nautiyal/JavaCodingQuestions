package TestCases;

public class ContigousSubArraySum {

	public static void main(String[] args) {
		//Given an array of numbers, return true if there is a subarray that sums up to a certain number n.
		
		int ar[]= {2,4,1,7,8};
		int n=8;
		if(subarray_sum(ar,n))
			System.out.println("Yes");
		else
			System.out.println("No");
			

	}
	
	public static boolean subarray_sum(int num[],int N)
	{
		
		int cur_sum=0;
		for (int i=0;i<num.length;i++)
		{
			if(cur_sum==N)
				return true;
			else
				cur_sum+=num[i];
			
		}
		return false;
		
	}

}
