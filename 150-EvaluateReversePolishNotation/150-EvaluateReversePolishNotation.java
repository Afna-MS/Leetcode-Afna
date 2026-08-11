// Last updated: 11/08/2026, 16:14:07
class Solution {
    int calculate(int a, int b, String op) {
        int ans=0;
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b; 
            
        }
        return ans;
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String ch : tokens) {
            if (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) {
                int b = st.pop(); 
                int a = st.pop(); 
                int ans=calculate(a, b, ch);
                st.push(ans);
            } else {
                st.push(Integer.parseInt(ch)); 
            }
        }
        return st.pop();
    }
}
