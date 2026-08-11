// Last updated: 11/08/2026, 16:09:33
class Solution {
    public int firstUniqChar(String s) {
        int f[]=new int[256];
        for(char c:s.toCharArray())
        f[c]++;
        for(int i=0;i<s.length();i++){
            if(f[s.charAt(i)]==1)
            return i;
        }
        return -1;
    }
}