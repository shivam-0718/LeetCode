//link: https://www.leetcode.com/problems/neighboring-bitwise-xor/description

class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int first = 0;
        int last = 0;

        for (int i : derived) {
            if (i == 1){
                last = ~last;
            } else{
                last = last;
            }
        }
        return first == last;
    }
}

public class Day_2025_01_17 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] derived = new int[]{1, 1, 0};
        boolean answer = sol.doesValidArrayExist(derived);
        System.out.println(answer);        
    }
}
