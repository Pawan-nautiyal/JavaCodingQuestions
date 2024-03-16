package Maps;

import java.util.*;

/**
 * @author Pawan Nautiyal
 *
 */
public class test_count_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java Program to count the number of words in a string using HashMap.
		//This this is very very high mountain 
		String str= "This This is very very high mountain ";
		Map<String, Integer> m1= new HashMap<>();
		
		String words[]=str.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			if(m1.containsKey(words[i]))
			{
				m1.put(words[i], m1.get(words[i])+1);
			}
			else
				m1.put(words[i], 1);
		}
		for (String  key : m1.keySet())
		{
			System.out.println("The word " + key + " came " + m1.get(key) + " times ");
		}
		
	}

}
