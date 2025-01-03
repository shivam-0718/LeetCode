//bruteforce
//link: https://leetcode.com/problems/number-of-ways-to-split-array/

class Solution {
    public int waysToSplitArray(int[] nums) {
        int ans = 0;
        for (int i = 1; i <= nums.length - 1; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += nums[j]; // left partition sum
            }
            System.out.println("Left: " + leftSum);

            for (int j = i; j < nums.length; j++) {
                rightSum += nums[j]; // right partition sum
            }
            System.out.println("Right: " + rightSum);

            // comparison
            if (leftSum >= rightSum)
                ans++;
        }
        return ans;

    }
}

// optimized approach
class Solution1 {
    public int waysToSplitArray(int[] nums) {
        int ans = 0, left = 0, right = 0;

        // sum of arrays
        for (int num : nums) {
            right += num;
        }

        // left right split
        for (int i = 0; i < nums.length - 1; i++) {
            left += nums[i];
            right -= nums[i];

            if (left >= right) {
                ans++;
            }
        }
        return ans;
    }
}

public class Day_2025_01_03 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = { 2, 3, 1, 0 };
        int ans = sol.waysToSplitArray(arr);
        System.out.println("Ways to split the array = " + ans);
    }
}
