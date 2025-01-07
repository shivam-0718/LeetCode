import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<String> stringMatching(String[] words) {
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String word1 = words[i];
                String word2 = words[j];
                if (word2.contains(word1)) { // Word 2 bada hai, uske andar word 1 hai, to word 1 hashset mein daala.
                    hashSet.add(word1);
                }

                if (word1.contains(word2)) {
                    hashSet.add(word2);
                }
            }
        }
        List<String> list = new ArrayList<>(hashSet);
        return list;
    }
}

public class Day_2025_01_07 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = { "mass", "as", "hero", "superhero" };
        List<String> result = sol.stringMatching(words);
        System.out.println(result);
    }
}
