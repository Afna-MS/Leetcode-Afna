// Last updated: 11/08/2026, 15:58:28
import java.util.*;
class Solution {
    public double minPrice(int[] p, int[] d) {
        Arrays.sort(p);
        Arrays.sort(d);
        double ts=0.0;
        int px=p.length-1;
        int dx=d.length-1;
        while(px>=0 && dx>=0){
            double dp=p[px]*(100.0-d[dx])/100.0;
            ts += dp;
            px--;
            dx--;
        }
        while(px>=0){
            ts += p[px];
            px--;
        }
        return ts;
    }
}