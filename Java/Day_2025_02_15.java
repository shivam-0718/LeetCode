//link: https://leetcode.com/problems/sqrtx/

class Solution {
    public int mySqrt(int n) {
        if (n == 0 || n == 1){
            return n;
        }

        long low = 1;
        long high = n/2;
        long mid = 0;

        while(low <= high){
            mid = (high + low) / 2;
            if((mid * mid) == n) {
                return (int) mid;
            } else if ((mid * mid) < n){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        // System.out.println(low + " " + mid + " " + high);
        return (int) high;

    }
}

public class Day_2025_02_15 {
    public static void main(String[] args) {
        
    }
}
