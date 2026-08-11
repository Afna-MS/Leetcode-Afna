// Last updated: 11/08/2026, 16:15:08
import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] arr = path.split("/");

        for (String ele : arr) {
            if (ele.equals("") || ele.equals(".")) {
                continue; 
            } else if (ele.equals("..")) {
                if (!st.isEmpty()) 
                    st.pop(); 
            } else {
                st.push(ele);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String ele : st) {
            sb.append("/");
            sb.append(ele);
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
