// Last updated: 11/08/2026, 16:16:49
class Solution {
    public int reverse(int x) {
        int s=0;
        while(x!=0){
        int d= x%10;
        if (s > Integer.MAX_VALUE / 10 || (s == Integer.MAX_VALUE / 10 && d > 7)) return 0;
        if (s < Integer.MIN_VALUE / 10 || (s == Integer.MIN_VALUE / 10 && d < -8)) return 0;
            s=s*10+d;
            x/=10;
        }
        return s;
    }
}