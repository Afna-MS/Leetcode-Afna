// Last updated: 04/10/2026, 16:42:46
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
12    public ListNode deleteDuplicates(ListNode head) {
13       ListNode dummy = new ListNode(0, head);
14        ListNode prev = dummy;
15
16        while (head != null) {
17            while (head.next != null && head.val == head.next.val) {
18                head = head.next;
19            }
20
21            if (prev.next == head) {
22                prev = prev.next;
23            } else {
24                prev.next = head.next;
25            }
26
27            head = head.next;
28        }
29
30        return dummy.next;
31    }
32}