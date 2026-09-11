// Last updated: 11/09/2026, 11:56:09
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode sortedArrayToBST(int[] nums) {
18        return build(nums, 0, nums.length - 1);
19    }
20    private TreeNode build(int[] nums, int l, int r) {
21        if (l > r) return null;
22        int mid = l + (r - l) / 2;
23        TreeNode root = new TreeNode(nums[mid]);
24        root.left = build(nums, l, mid - 1);
25        root.right = build(nums, mid + 1, r);
26        return root;
27    }
28}
29