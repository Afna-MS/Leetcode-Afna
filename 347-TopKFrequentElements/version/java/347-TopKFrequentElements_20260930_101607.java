// Last updated: 30/09/2026, 10:16:07
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        Map<Integer, Integer> map = new HashMap<>();
4        for (int num : nums) {
5            map.put(num, map.getOrDefault(num, 0) + 1);
6        }
7        List<Integer>[] bucket = new ArrayList[nums.length + 1];
8        for (int num : map.keySet()) {
9            int freq = map.get(num);
10            if (bucket[freq] == null) {
11                bucket[freq] = new ArrayList<>();
12            }
13            bucket[freq].add(num);
14        }
15        int[] ans = new int[k];
16        int idx = 0;
17        for (int i = nums.length; i >= 0 && idx < k; i--) {
18            if (bucket[i] == null) continue;
19            for (int num : bucket[i]) {
20                ans[idx++] = num;
21                if (idx == k) {
22                    return ans;
23                }
24            }
25        }
26        return ans;
27    }
28}