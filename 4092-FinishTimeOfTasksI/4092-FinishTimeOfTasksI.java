// Last updated: 11/08/2026, 15:59:48
class Solution {
    List<Integer>[]tree;
    int []base;
    public long finishTime(int n, int[][] edges, int[] baseTime) {
        this.base=baseTime;
        tree=new ArrayList[n];
        for(int i=0;i<n;i++){
            tree[i]=new ArrayList<>();
        }
        for(int[]e:edges){
            tree[e[0]].add(e[1]);
        }
        return dfs(0);
    }
    private long dfs(int node){
        if(tree[node].isEmpty()){
            return base[node];
        }
        long early=Long.MAX_VALUE;
        long latest=Long.MIN_VALUE;
        for(int c:tree[node]){
            long finish=dfs(c);
            early=Math.min(early,finish);
            latest=Math.max(latest,finish);
        }
        long duration=(latest-early)+base[node];
        return latest+duration;
    }
}