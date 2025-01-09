//link: https://leetcode.com/problems/counting-words-with-a-given-prefix/description/

class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}

public class Day_2025_01_09 {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";

        Solution sol = new Solution();
        System.out.println(sol.prefixCount(words, pref));
    }
}
