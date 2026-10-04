// Last updated: 04/10/2026, 16:43:17
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
12    public ListNode partition(ListNode head, int x) {
13       ListNode lessDummy = new ListNode(0);
14        ListNode greaterDummy = new ListNode(0);
15
16        ListNode less = lessDummy;
17        ListNode greater = greaterDummy;
18
19        while (head != null) {
20            if (head.val < x) {
21                less.next = head;
22                less = head;
23            } else {
24                greater.next = head;
25                greater = head;
26            }
27
28            head = head.next;
29        }
30
31        greater.next = null;
32        less.next = greaterDummy.next;
33
34        return lessDummy.next;
35    }
36}