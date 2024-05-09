package Maps;
import java.util.*;
/*
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:

Input: strs = [""]
Output: [[""]]

Example 3:

Input: strs = ["a"]
Output: [["a"]]

 */
public class group_anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"eat","tea","tan","ate","nat","bat"};
		System.out.println("The Group of Anagram is: " +groupAnagrams(str));
	}
	public static List<List<String>> groupAnagrams(String []strs){
		Map<String,List> m1= new HashMap<>();
		for(String str: strs)
		{
			int [] ar= new int[26];
            for(char ch: str.toCharArray())
                ar[ch-'a']++;
            StringBuilder st = new StringBuilder();
            for(int i : ar){
                st.append("#");
                st.append(i);   
            }
            String key=st.toString(); //first key 
            if(!m1.containsKey(key))
                m1.put(key, new ArrayList<String>()); //key : ['ate']
            m1.get(key).add(str); //key:['ate','eat']    
        }
        return new ArrayList(m1.values());
		}
		
		
	}
