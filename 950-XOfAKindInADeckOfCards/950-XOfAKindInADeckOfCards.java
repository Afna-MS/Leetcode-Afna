// Last updated: 11/08/2026, 16:03:43
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int d : deck) count.put(d, count.getOrDefault(d, 0) + 1);
        int g = 0;
        for (int c : count.values()) g = gcd(g, c);
        return g >= 2;
    }
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
