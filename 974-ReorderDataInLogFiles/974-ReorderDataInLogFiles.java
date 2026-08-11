// Last updated: 11/08/2026, 16:03:22
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (a, b) -> {
            String[] sa = a.split(" ", 2);
            String[] sb = b.split(" ", 2);
            boolean isDigitA = Character.isDigit(sa[1].charAt(0));
            boolean isDigitB = Character.isDigit(sb[1].charAt(0));
            if (!isDigitA && !isDigitB) {
                int cmp = sa[1].compareTo(sb[1]);
                if (cmp != 0) return cmp;
                return sa[0].compareTo(sb[0]);
            }
            return isDigitA ? (isDigitB ? 0 : 1) : -1;
        });
        return logs;
    }
}
