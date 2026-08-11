// Last updated: 11/08/2026, 16:14:01
class Solution {
    public int findPeakElement(int[] number) {
        int left = 0;
        int right = number.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (number[mid] > number[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
