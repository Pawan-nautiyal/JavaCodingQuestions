package TestCases;

public class accolite_assesment {
	public static void main(String[] args) {
		String str="BBDD";
		System.out.println(makeStringSteady(str));
	
}

	public static int makeStringSteady(String input) {
        int[] count = new int[4];
        int n = input.length();
        int steadyCount = n / 4;
        for (char c : input.toCharArray()) {
            if (c == 'B') count[0]++;
            else if (c == 'D') count[1]++;
            else if (c == 'U') count[2]++;
            else if (c == 'H') count[3]++;
        }

        int minReplaceLength = n;
        int left = 0, right = 0;
        while (right < n) {
            while (right < n && !isSteady(count, steadyCount)) {
                char c = input.charAt(right);
                if (c == 'B') count[0]--;
                else if (c == 'D') count[1]--;
                else if (c == 'U') count[2]--;
                else if (c == 'H') count[3]++;
                right++;
            }

            if (isSteady(count, steadyCount)) {
                minReplaceLength = Math.min(minReplaceLength, right - left);
            }

            while (left < right && isSteady(count, steadyCount)) {
                char c = input.charAt(left);
                if (c == 'B') count[0]++;
                else if (c == 'D') count[1]++;
                else if (c == 'U') count[2]++;
                else if (c == 'H') count[3]--;
                left++;
            }

            if (isSteady(count, steadyCount)) {
                minReplaceLength = Math.min(minReplaceLength, right - left + 1);
            }
        }
        return minReplaceLength;
    }

    private static boolean isSteady(int[] count, int steadyCount) {
        for (int c : count) {
            if (c > steadyCount) {
                return false;
            }
        }
        return true;
    }	
}