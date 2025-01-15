//link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while(num > 0){
            int value = (num %2 == 0)?num/2:num-1;
            num = value;
            steps++;
        }
        return steps;
    }
}

public class Day_2025_01_15 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int number = 87632;
        int steps = sol.numberOfSteps(number);
        System.out.print("The number of operations required to make the " + number + " to zero is " + steps);

    }
}