// Last updated: 04/10/2026, 17:19:22
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        if (head== null) return null;
19
20        Map<Node, Node> map = new HashMap<>();
21
22        Node curr = head;
23
24        while (curr != null) {
25            map.put(curr, new Node(curr.val));
26            curr = curr.next;
27        }
28
29        curr = head;
30
31        while (curr != null) {
32            map.get(curr).next = map.get(curr.next);
33            map.get(curr).random = map.get(curr.random);
34            curr = curr.next;
35        }
36
37        return map.get(head);
38    }
39}