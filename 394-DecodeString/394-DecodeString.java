// Last updated: 11/08/2026, 16:09:19
class Solution {
    public String decodeString(String s) {
        Stack<Integer>st1 = new Stack<>();
        Stack<StringBuilder>st2 = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int n = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0'); 
            } else if (c == '[') {
                st1.push(n);
                st2.push(curr);
                curr = new StringBuilder();
                n = 0;
            } else if (c == ']') {
                int t = st1.pop();
                StringBuilder prev = st2.pop();
                for (int i = 0; i < t; i++) {
                    prev.append(curr);
                }
                curr = prev;
            } else {
                curr.append(c);
            }
        }
        return curr.toString();
    }
}
