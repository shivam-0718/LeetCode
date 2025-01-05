//link: https://leetcode.com/problems/two-sum/
class Solution {
    // brute force
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        // This is important because we are giving return statement inside of nested
        // for.
        // This return will work <=> There is no valid pair found
        return new int[] {};
    }
}
// This will be revisited once Map, HasMap, Set is read

public class Day_2025_01_04 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] ans = sol.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        for (int num : ans) {
            System.out.println(num);
        }
    }
}
