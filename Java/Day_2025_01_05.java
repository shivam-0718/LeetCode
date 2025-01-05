
//link: https://leetcode.com/problems/valid-anagram/description/
import java.util.Arrays;

public class Day_2025_01_05 {

    public boolean isAnagram (String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        char[] new_s = s.toCharArray();
        Arrays.sort(new_s);

        char[] new_t = t.toCharArray();
        Arrays.sort(new_t);

        for (int i=0; i<new_s.length; i++){
            if (new_s[i] != new_t[i]){
                return false;
            }
        }
        return true;
    }    

    public static void main(String[] args) {
        Day_2025_01_05 obj = new Day_2025_01_05();
        System.out.println(obj.isAnagram("anagram", "nagaram"));
    }
}