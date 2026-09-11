// Last updated: 11/09/2026, 12:38:43
1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
4        for (int s : stones) pq.add(s);
5        while (pq.size() > 1) {
6            int a = pq.poll(), b = pq.poll();
7            if (a != b) pq.add(a - b);
8        }
9        return pq.isEmpty() ? 0 : pq.peek();
10    }
11}
12