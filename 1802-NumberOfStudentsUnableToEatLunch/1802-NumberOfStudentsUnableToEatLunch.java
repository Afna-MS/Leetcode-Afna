// Last updated: 11/08/2026, 16:01:50
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer>st=new Stack<>();
        Queue<Integer>q=new LinkedList<>();
        for(int i=sandwiches.length-1;i>=0;i--)
        st.push(sandwiches[i]);
        for(int stud:students)
        q.add(stud);
        int time=0;
        while(!st.isEmpty() && !q.isEmpty() && time<st.size()){
            if(q.peek()==st.peek()){
                st.pop();
                q.poll();
                time=0;
            }else{
                time++;
                q.add(q.poll());
            }
        }
        return q.size();
    }
}