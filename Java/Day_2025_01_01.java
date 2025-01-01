import java.lang.String;
import java.lang.Math;

class Solution {

    // Brute-force approach
    public int maxScore(String s) {
        String left = "";
        String right = "";
        int max = 0;
        for (int i = 1; i <= s.length() - 1; i++) {
            int count_zero = 0;
            int count_one = 0;
            left = s.substring(0, i);
            right = s.substring(i);
            // System.out.println("Left Substring: " + left);
            // System.out.println("Right Substring: " + right);

            for (char c : left.toCharArray()) {
                if (c == '0') {
                    count_zero++;
                }
            }
            for (char c : right.toCharArray()) {
                if (c == '1') {
                    count_one++;
                }
            }
            max = Math.max(count_zero + count_one, max);

            // System.out.println("Count 0: " + count_zero);
            // System.out.println("Count 1: " + count_one);
            // System.out.println("Max: " + max);
        }
        return max;
    }

    // 2-pass optimized approach
    public int maxScore_opt(String str) {
        int zero = 0;
        int one = 0;
        for (char c : str.toCharArray()) {
            if (c == '1') {
                one++;
            }
        }
        int max = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == '0') {
                zero++;
            } else {
                one--;
            }
            max = Math.max(zero + one, max);
        }

        return max;
    }
}

public class Day_2025_01_01 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Max value via brute-force: " + sol.maxScore("011101"));

        System.out.println("Max value via optimized: " + sol.maxScore_opt("011101"));
    }
}