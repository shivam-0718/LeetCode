//link: https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/description/
class Solution {
    private boolean isPrefixAndSuffix(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();

        //Given that length of string 1 should be less than length of string 2
        if (n1 > n2) {
            return false;
        }

        return str2.startsWith(str1) && str2.endsWith(str1);
    }

    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String word1 = words[i];
                String word2 = words[j];
                if (isPrefixAndSuffix(word1, word2)) {
                    count++;
                }
            }
        }
        return count;

    }
}

public class Day_2025_01_08 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = {"a","aba","ababa","aa"};
        int result = sol.countPrefixSuffixPairs(words);
        System.out.println(result);

    }
}
