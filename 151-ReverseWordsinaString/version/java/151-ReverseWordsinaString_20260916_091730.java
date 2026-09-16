// Last updated: 16/09/2026, 09:17:30
1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.trim().split("\\s+");
4        StringBuilder sb = new StringBuilder();
5        for (int i = words.length - 1; i >= 0; i--) {
6            sb.append(words[i]);
7            if (i > 0) sb.append(" ");
8        }    
9        return sb.toString();
10    }
11}
12