import java.util.HashMap;
import java.util.Map;

class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        //Creating a hashmap to store frequency of each element
        Map<Integer, Integer> freq = new HashMap<>();

        //As each element appears n2 times in num1 element, so adding frequencies for num1 elements
        for (int num: nums1){
            freq.put(num, freq.getOrDefault(num, 0) + len2);
        }

        //As each element appears n1 times in num1 element, so adding frequencies for num2 elements
        for (int num: nums2){
            freq.put(num, freq.getOrDefault(num, 0) + len1);
        }

        //Finding XOR numbers that appear odd number of times, because even numbers XOR is 0.
        int ans = 0;
        for(int num: freq.keySet()){
            if(freq.get(num) % 2 == 1){
                ans^=num;
            }
        }
        return ans;
    }
}

public class Day_2025_01_16 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = new int[] {2, 1, 3};
        int[] nums2 = new int[] {10, 2, 5, 0};
        int ans = sol.xorAllNums(nums1, nums2);
        System.out.println(ans);

    }
}