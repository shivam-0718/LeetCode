//link: https://leetcode.com/problems/palindrome-number/description/

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        
        int original = x;
        int palindrome = 0;
        while (x != 0){
            int temp = x % 10;
            palindrome = (palindrome * 10) + temp;
            x /= 10;
        }
        return original == palindrome;
    }
}

public class Day_2025_02_14 {
    public static void main(String[] args) {
        
    }
}
