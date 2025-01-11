//link: https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {

        // traversing each accounts[i] and find the sum of each and putting it in
        // sumAmounts
        int[] sumAmounts = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            sumAmounts[i] = sum(accounts[i]);
        }

        // finding a maximum value out of elements in an array
        int maxAmount = sumAmounts[0];
        for (int n : sumAmounts) {
            if (n > maxAmount) {
                maxAmount = n;
            }
        }

        return maxAmount;
    }

    // sum of every person in his account
    private static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}


public class Day_2025_01_11 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] bank = new int[][] { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };

        int maxAmount = sol.maximumWealth(bank);
        System.out.println("Maximum amount the person is having is: " + maxAmount);
    }
}
