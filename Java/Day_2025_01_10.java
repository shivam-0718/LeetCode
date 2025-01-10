//link: https://leetcode.com/problems/valid-palindrome/description/

/*
 * Psuedo code
 * 
 * 1 -> Separate variable for newStr
 * 2 -> Traverse through s -> Fetch alpha and numbers -> Character class
 * 3 -> Add alphanumeric into newStr, and make it all to lowercase
 * 4 -> 2 pointers: leading and trailing
 * 5 -> Run a loop
 * 6 -> Characters are not same -> Return false
 */
class Solution {
    public boolean isPalindrome(String s) {
        String newStr = "";

        // removing alphanumeric characters and traversing into Str
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                newStr += c;
            }
        }
        newStr = newStr.toLowerCase();

        // 2 pointers and then traversing as per their names
        int leading = 0;
        int trailing = newStr.length() - 1;

        while (leading < trailing) {
            if (newStr.charAt(leading) != newStr.charAt(trailing)) {
                return false;
            }

            leading += 1;
            trailing -= 1;
        }
        return true;
    }
}

public class Day_2025_01_10 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        Solution sol = new Solution();

        boolean ans = sol.isPalindrome(s);
        if (ans) {
            System.out.println(s + " " + "is a palindrome");
        }
        else {
            System.out.println(s + " " + "is not a palindrome");
        }
        
    }
}
