package TestCases;

public class swapstrings {
	public static void main(String[] args) {
		String str1="Pawan";
		String str2="Nautiyal";

		System.out.println("The String before swap is str1: "+str1+" And String str2 : "+str2);
		int len1=str1.length();
		str1=str1+str2;//PawanNautiyal
		str2=str1.substring(0,len1);//
		str1=str1.substring(str2.length());
		
		
		System.out.println("The String After swap is str1: '"+str1+"' And String str2 : "+str2);
}
}