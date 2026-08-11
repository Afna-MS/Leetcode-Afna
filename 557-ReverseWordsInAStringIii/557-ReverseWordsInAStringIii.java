// Last updated: 11/08/2026, 16:08:16
class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int start = 0;
        
        for (int end = 0; end <= n; end++) {
            if (end == n || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }
        return new String(arr);
    }
    
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}
