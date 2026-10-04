// Last updated: 04/10/2026, 17:25:36
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode slow = head;
15        ListNode fast = head;
16
17        while (fast != null && fast.next != null) {
18            slow = slow.next;
19            fast = fast.next.next;
20
21            if (slow == fast) {
22                ListNode curr = head;
23
24                while (curr != slow) {
25                    curr = curr.next;
26                    slow = slow.next;
27                }
28
29                return curr;
30            }
31        }
32
33        return null;
34    }
35}