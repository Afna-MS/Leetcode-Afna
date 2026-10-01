// Last updated: 01/10/2026, 10:19:17
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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13        if (left == right) return head;
14
15        ListNode dummy = new ListNode(0, head);
16        ListNode prev = dummy;
17
18        for (int i = 1; i < left; i++) {
19            prev = prev.next;
20        }
21
22        ListNode curr = prev.next;
23
24        for (int i = 0; i < right - left; i++) {
25            ListNode next = curr.next;
26            curr.next = next.next;
27            next.next = prev.next;
28            prev.next = next;
29        }
30
31        return dummy.next;
32    }
33}