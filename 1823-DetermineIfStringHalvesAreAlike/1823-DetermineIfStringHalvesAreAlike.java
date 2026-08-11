// Last updated: 11/08/2026, 16:01:41
import java.util.*;

class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int n = s.length(), half = n / 2, balance = 0;
        for (int i = 0; i < half; i++) {
            if (vowels.indexOf(s.charAt(i)) >= 0) balance++;
            if (vowels.indexOf(s.charAt(i + half)) >= 0) balance--;
        }
        return balance == 0;
    }
}
