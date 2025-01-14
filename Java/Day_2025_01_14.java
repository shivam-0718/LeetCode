//link: https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/description/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        // defining a prefix common array with the length of A
        int[] ans = new int[A.length];

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> inter = new HashSet<>();
        for (int i = 0; i < ans.length; i++) {
            a.add(A[i]);
            b.add(B[i]);
            inter = new HashSet<>(a);
            inter.retainAll(b);
            ans[i] = inter.size();
        }
        return ans;
    }

    // Approach 2
    public int[] findThePrefixCommonArray(int[] A, int[] B, int sample) {

        // defining a prefix common array with the length of A
        int[] ans = new int[A.length];
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        int count = 0;
        for (int i = 0; i < ans.length; i++) {
            if (!a.contains(A[i])) {
                a.add(A[i]);
                if (b.contains(A[i])) {
                    count++;
                }
            }

            if (!b.contains(B[i])) {
                b.add(B[i]);
                if (a.contains(B[i])) {
                    count++;
                }
            }

            ans[i] = count;
        }
        return ans;
    }

    // Approach 3
    public int[] findThePrefixCommonArray(int[] A, int[] B, String sample2) {
        
        //defining a prefix common array with the length of A
        int[] ans = new int[A.length];
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < ans.length; i++) {
            int curr_a_val = hashmap.getOrDefault(A[i], 0);
            curr_a_val++;
            hashmap.put(A[i], curr_a_val);
            if (curr_a_val == 2){
                count ++;
            }

            int curr_b_val = hashmap.getOrDefault(B[i], 0);
            curr_b_val++;
            hashmap.put(B[i], curr_b_val);
            if (curr_b_val == 2){
                count ++;
            }

            ans[i] = count;
        }
        return ans;
    }
}

public class Day_2025_01_14 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] answer = sol.findThePrefixCommonArray(new int[] { 1, 3, 2, 4 }, new int[] { 3, 1, 2, 4 });

        for (int a : answer) {
            System.out.println(a);
        }
    }
}
