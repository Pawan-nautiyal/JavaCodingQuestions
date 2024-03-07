package TestCases;

public class Merge_string_alternatively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Money";
		String str2="Fraud";
		System.out.println(mergeAlternately(str1,str2));
		

	}
	
	public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged=new StringBuilder();
        int len1=word1.length();
        int len2=word2.length();
        int total_len=len1+len2;
        int i=0;int j=0;
        while(total_len>0)
        {
            if(i<len1){
                merged.append(word1.charAt(i));
                i++;
            }
            if(j<len2){
                merged.append(word2.charAt(j));
                j++;   
            }
            total_len--;     
        }      
        return merged.toString();
    }

}
