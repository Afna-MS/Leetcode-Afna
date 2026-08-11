// Last updated: 11/08/2026, 15:58:30
class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n==1)
            return s;
        long max=n-1;
        long x=(max%2==1)?max:max-1;
        long k=(x+1)/2;
        long d=(x-1)/2;
        long peak= (long)s+(k*m)-(d*1);
            return Math.max((long)s,peak);
    }
}