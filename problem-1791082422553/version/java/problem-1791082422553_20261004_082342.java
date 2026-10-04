// Last updated: 04/10/2026, 08:23:42
1class Solution {
2    public int minRotations(String s) {
3        int c=0;
4        int t=0;
5        for(int i=0;i<s.length();i++){
6            int next=s.charAt(i)-'0';
7            int diff=Math.abs(c-next);
8            int r=Math.min(diff,10-diff);
9            t+= r;
10            c=next;
11        }
12        return t;
13    }
14}