// Last updated: 04/10/2026, 17:26:58
1class LRUCache {
2    class Node {
3        int key, val;
4        Node prev, next;
5
6        Node(int key, int val) {
7            this.key = key;
8            this.val = val;
9        }
10    }
11
12    Map<Integer, Node> map;
13    Node head, tail;
14    int capacity;
15
16    public LRUCache(int capacity) {
17        this.capacity = capacity;
18        map = new HashMap<>();
19
20        head = new Node(0, 0);
21        tail = new Node(0, 0);
22
23        head.next = tail;
24        tail.prev = head;
25    }
26
27    public int get(int key) {
28        if (!map.containsKey(key)) return -1;
29
30        Node node = map.get(key);
31        remove(node);
32        insert(node);
33
34        return node.val;
35    }
36
37    public void put(int key, int value) {
38        if (map.containsKey(key)) {
39            remove(map.get(key));
40        }
41
42        Node node = new Node(key, value);
43        map.put(key, node);
44        insert(node);
45
46        if (map.size() > capacity) {
47            Node lru = tail.prev;
48            remove(lru);
49            map.remove(lru.key);
50        }
51    }
52
53    private void insert(Node node) {
54        node.next = head.next;
55        node.prev = head;
56
57        head.next.prev = node;
58        head.next = node;
59    }
60
61    private void remove(Node node) {
62        node.prev.next = node.next;
63        node.next.prev = node.prev;
64    }
65}
66
67/**
68 * Your LRUCache object will be instantiated and called as such:
69 * LRUCache obj = new LRUCache(capacity);
70 * int param_1 = obj.get(key);
71 * obj.put(key,value);
72 */