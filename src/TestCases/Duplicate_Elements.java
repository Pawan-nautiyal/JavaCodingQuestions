package TestCases;
import java.util.*;
import java.util.Map.Entry;

public class Duplicate_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find duplicate element in array
		String[] Lang= {"Math","English","Math", "History","History","Biology","Math"};
		
		//Worst Case scenario-Brute force approach (O{n*n})
		for(int i=1;i<Lang.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(Lang[j]==Lang[i]) {
					System.out.println("The duplicate element is: "+Lang[j]);
				}
			}
			
		}
		System.out.println("***********next approach");
		
		//using Hash set class of set interface (O{n})
		Set<String> store_name= new HashSet<String>();
		for(String Name:Lang)
		{
			if((store_name.add(Name))== false)
				System.out.println("The Duplicate Element is :"+Name);
			
		}
		
		System.out.println("***********next approach");
		
		//Using Hash Map
		Map<String, Integer> Storemap=new HashMap<String, Integer>();
		for(String Names: Lang)
		{
			Integer count=Storemap.get(Names);
			if(count == null)
				Storemap.putIfAbsent(Names,1);
			else
				Storemap.put(Names, ++count);
				
		}
		//get values from hashmap
		
		//Set<Entry<String, Integer>> entryset = Storemap.entrySet();
		for(Entry<String,Integer> entry:Storemap.entrySet())
		{
			if(entry.getValue()>1)
				System.out.println("The Duplicate Element is : "+ entry.getKey());
		}
		 
	}

}
