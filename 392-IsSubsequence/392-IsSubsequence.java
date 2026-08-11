// Last updated: 11/08/2026, 16:09:24
class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        int i = 0;
        if(s.length() == 0){
            return true;
        }
        while(i < t.length()){
            if(s.charAt(j) == t.charAt(i)){
                i++;
                j++;
            }else{
                i++;
            }
            if(j == s.length()){
                return true;
            }
        }
        return false;
    }
}    