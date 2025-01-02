// link: https://leetcode.com/problems/contains-duplicate/description/
import java.util.Arrays;
class Solution {
    //brute force method
    public boolean containsDuplicate(int[] nums) {
        boolean isDuplicate = false;
        for (int i = 0; i<nums.length; i++){
            for (int j = i+1; j<nums.length; j++){
                if (nums[i] == nums[j]){
                    isDuplicate = true;
                    break;
                }
            }
        }
        return isDuplicate;
    }
}
//This will exceed the time limit

//using sorting method
class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        boolean isDuplicate = false;
        Arrays.sort(nums);
        for (int i=0; i < nums.length - 1; i++){
            if (nums[i] == nums[i+1]){
               isDuplicate = true;
               break;     
            }
        }

        return isDuplicate;
    }
}

public class Day_2025_01_02 {
    public static void main(String[] args) {
        // Solution sol = new Solution();
        // int [] nums = {1, 2, 3, 4};
        // boolean isDuplicate = sol.containsDuplicate(nums);

        Solution1 sol2 = new Solution1();
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean isDuplicate = sol2.containsDuplicate(nums);
        
        if(isDuplicate){
            System.out.println("Duplicates exist in array!");
        } else{
            System.out.println("Elements are distinct in array!");
        }


    }
}
