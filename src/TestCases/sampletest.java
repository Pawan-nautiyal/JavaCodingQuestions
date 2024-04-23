package TestCases;

public class sampletest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,2,3,4,5};
		int k=4;
		rotate(ar,k);
		System.out.println("The Array after rotation is : \n" );
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
	}
	public static void rotate(int ar[],int k)
	{
		k=k%ar.length;
		int temp,prev;
		for(int i =0;i<k;i++)
		{
			prev=ar[ar.length-1];
			for(int j=0;j<ar.length;j++)
			{
				temp=ar[j];
				ar[j]=prev;
				prev=temp;
			}
		}
	}
	
}
