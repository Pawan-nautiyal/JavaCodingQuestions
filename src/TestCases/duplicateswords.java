package TestCases;
import java.util.*;
import java.util.Map.Entry;
public class duplicateswords {

	public static void main(String[] args) {
		// hey java is java and java is best language
		//java=3
		//is=2
		
		String str="java is java and java is best language";
		duplicates(str);
		
		

}
	
	public static void duplicates(String str1)
	{
		String input[]=str1.split(" ");
		//creating one hashmap:
		Map<String, Integer> count_words= new HashMap<String, Integer>();
		
		for(String word :input)
		{
			if (count_words.containsKey(word)) {
				count_words.put(word,count_words.get(word)+1);
			}
			else
				count_words.put(word,1);
			
		}
		//System.out.println("The Words and there count is : "+count_words);
		
		//extracting all the keys of map -wordCount:
		//Set<Entry<String, Integer>> words =count_words.entrySet();
		Set<String> words =count_words.keySet();
		
		for(String str:words) {
			if(count_words.get(str)>1)
				System.out.println("The word "+ str+" comes "+count_words.get(str)+" times");
		}
		
	}
}
