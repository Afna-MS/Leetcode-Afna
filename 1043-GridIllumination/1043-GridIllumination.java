// Last updated: 11/08/2026, 16:03:14
public class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        Set<Long> lampSet = new HashSet<>();
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        Set<Integer> diag1 = new HashSet<>();
        Set<Integer> diag2 = new HashSet<>();
        for (int[] lamp : lamps) {
            long key = ((long) lamp[0] << 32) + lamp[1];
            if (lampSet.contains(key)) continue;
            lampSet.add(key);
            rows.add(lamp[0]);
            cols.add(lamp[1]);
            diag1.add(lamp[0] + lamp[1]);
            diag2.add(lamp[0] - lamp[1]);
        }
        int[] result = new int[queries.length];
        int idx = 0;
        for (int[] q : queries) {
            int r = q[0], c = q[1];
            if (rows.contains(r) || cols.contains(c) || diag1.contains(r + c) || diag2.contains(r - c)) {
                result[idx++] = 1;
            } else {
                result[idx++] = 0;
            }
            for (int i = r - 1; i <= r + 1; i++) {
                for (int j = c - 1; j <= c + 1; j++) {
                    long key = ((long) i << 32) + j;
                    if (lampSet.contains(key)) {
                        lampSet.remove(key);
                        boolean rowActive = false, colActive = false, d1Active = false, d2Active = false;
                        for (long lampKey : lampSet) {
                            int x = (int) (lampKey >> 32);
                            int y = (int) (lampKey & 0xffffffffL);
                            if (x == i) rowActive = true;
                            if (y == j) colActive = true;
                            if (x + y == i + j) d1Active = true;
                            if (x - y == i - j) d2Active = true;
                        }
                        if (!rowActive) rows.remove(i);
                        if (!colActive) cols.remove(j);
                        if (!d1Active) diag1.remove(i + j);
                        if (!d2Active) diag2.remove(i - j);
                    }
                }
            }
        }
        return result;
    }
}
