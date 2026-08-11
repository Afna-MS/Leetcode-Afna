// Last updated: 11/08/2026, 16:16:04
class Solution {
    public double myPow(double x, int n) {
        long N = n; 
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1;
        double current = x;
        while (N > 0) {
            if ((N % 2) == 1) {
                result *= current;
            }
            current *= current;
            N /= 2;
        }
        return result;
    }
}
