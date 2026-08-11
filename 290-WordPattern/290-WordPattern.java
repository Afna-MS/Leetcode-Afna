// Last updated: 11/08/2026, 16:10:18
import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if (pattern.length() != words.length) {
            return false;
        }
        HashMap<Object, Integer> map = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (!Objects.equals(map.put(c, i), map.put(word, i))) {
                return false;
            }
        }
        
        return true;
    }
}