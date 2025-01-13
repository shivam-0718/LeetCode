//link: https://leetcode.com/problems/minimum-length-of-string-after-operations/description/
//Good question

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minimumLength(String s) {
        Map<Character, Integer> letterMap = new HashMap<>();
        int s_length = 0;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            Integer val = letterMap.get(c);

            if(val != null){
                letterMap.put(c, val+1);
            } else{
                letterMap.put(c, 1);
            }
        }
        for (Integer value: letterMap.values()) {
            int v = (int) value;
            if(v % 2 == 1){
                s_length += 1;
            } else {
                s_length += 2;
            }
        }

        return s_length;
    }
}


public class Day_2025_01_13 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int s_length = sol.minimumLength("aa");
        System.out.println(s_length);
    }
}
