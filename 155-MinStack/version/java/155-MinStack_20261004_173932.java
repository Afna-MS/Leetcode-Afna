// Last updated: 04/10/2026, 17:39:32
1class MinStack {
2    Stack<Integer> stack;
3    Stack<Integer> minStack;
4
5    public MinStack() {
6        stack = new Stack<>();
7        minStack = new Stack<>();
8    }
9
10    public void push(int val) {
11        stack.push(val);
12
13        if (minStack.isEmpty() || val <= minStack.peek()) {
14            minStack.push(val);
15        }
16    }
17
18    public void pop() {
19        if (stack.pop().equals(minStack.peek())) {
20            minStack.pop();
21        }
22    }
23
24    public int top() {
25        return stack.peek();
26    }
27
28    public int getMin() {
29        return minStack.peek();
30    }
31}
32/**
33 * Your MinStack object will be instantiated and called as such:
34 * MinStack obj = new MinStack();
35 * obj.push(value);
36 * obj.pop();
37 * int param_3 = obj.top();
38 * int param_4 = obj.getMin();
39 */