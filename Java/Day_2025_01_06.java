//link: https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description/
class Solution {
    public int[] minOperations(String boxes) {
        char[] box = boxes.toCharArray();
        int[] ans = new int[box.length];

        // making 2 cursors i and j (i will be position where we will add 1, and j will
        // be moving cursor)
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box.length; j++) {
                if (box[j] == '1') {
                    ans[i] += Math.abs(i - j);
                }
            }
        }
        return ans;
    }
}

public class Day_2025_01_06 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] answer = sol.minOperations("001011");
        System.out.print("The minimum number of operations to move all balls to the same box: [ ");

        for (int ans : answer) {
            System.out.print(ans + " ");
        }

        System.out.print("]");
    }
}
