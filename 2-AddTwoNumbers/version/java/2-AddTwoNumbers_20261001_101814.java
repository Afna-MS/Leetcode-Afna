// Last updated: 01/10/2026, 10:18:14
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode dummy = new ListNode();
14        ListNode curr = dummy;
15        int carry = 0;
16
17        while (l1 != null || l2 != null || carry != 0) {
18            int sum = carry;
19
20            if (l1 != null) {
21                sum += l1.val;
22                l1 = l1.next;
23            }
24
25            if (l2 != null) {
26                sum += l2.val;
27                l2 = l2.next;
28            }
29
30            curr.next = new ListNode(sum % 10);
31            curr = curr.next;
32            carry = sum / 10;
33        }
34
35        return dummy.next;
36    }
37}