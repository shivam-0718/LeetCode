//link: https://leetcode.com/problems/fizz-buzz/description/
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        // Creating a result list
        List<String> result = new ArrayList<>();

        // Creating a list as per given integer
        for (int i = 1; i < n + 1; i++) {
            // If divisible by both 3 and 5, add "FizzBuzz"
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            // If divisible by 3, add "Fizz"
            } else if (i % 3 == 0) {
                result.add("Fizz");
            // If divisible by 5, add "Buzz"
            } else if (i % 5 == 0) {
                result.add("Buzz");
            // Otherwise, add the number as a string
            } else {
                result.add(String.valueOf(i));
            }
        }

        // Return the result list
        return result;
    }
}

public class Day_2025_01_12 {
    public static void main(String[] args) {
        int number = 15;
        Solution sol = new Solution();
        List<String> result = sol.fizzBuzz(number);

        System.out.println("The array is: ");
        for (String s: result){
            System.out.print(s + " ");
        }


    }
}
