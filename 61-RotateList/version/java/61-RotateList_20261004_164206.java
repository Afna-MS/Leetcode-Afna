// Last updated: 04/10/2026, 16:42:06
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode rotateRight(ListNode head, int k) {
13       if (head == null || head.next == null || k == 0) return head;
14
15        int n = 1;
16        ListNode tail = head;
17
18        while (tail.next != null) {
19            tail = tail.next;
20            n++;
21        }
22
23        k %= n;
24        if (k == 0) return head;
25
26        tail.next = head;
27
28        for (int i = 0; i < n - k; i++) {
29            tail = tail.next;
30        }
31
32        ListNode newHead = tail.next;
33        tail.next = null;
34
35        return newHead;
36    }
37}