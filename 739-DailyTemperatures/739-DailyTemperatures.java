// Last updated: 11/08/2026, 16:05:51
import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>st=new Stack<>();
        int n=temperatures.length;
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            while( !st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int idx = st.pop();
                ans[idx] = i - idx; 
            }
            st.push(i);
        }
        return ans;
    }
}