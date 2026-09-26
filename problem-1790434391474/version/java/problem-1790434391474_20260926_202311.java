// Last updated: 26/09/2026, 20:23:11
1class Solution {
2    public boolean canTransform(int[] source, int[] target) {
3        if(source.length != target.length) return false;
4        long s1=0;
5        long s2=0;
6        for(int i=0;i<source.length;i++){
7            s1 += source[i];
8            s2 += target[i];
9        }
10        return s1==s2;
11    }
12}