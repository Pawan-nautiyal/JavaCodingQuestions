package TestCases;
import java.util.*;
import java.util.List;
/*
 * Kids with greatest number of candies
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.
 */


public class ArrayList_boolean {

	public static void main(String[] args) {
		int ar[]= {1,5,6,2,4};
		System.out.println(kidsWithCandies(ar,2));

	}
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        //ArrayList<Boolean> result=new ArrayList<Boolean>();
        List<Boolean> result=new ArrayList<>();
        for (int i:candies)
        {
            if (i>max)
                max=i;
        }
        for(int i=0;i<candies.length;i++)
        {
            if((candies[i]+extraCandies)>=max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }

}
