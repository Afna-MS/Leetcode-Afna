// Last updated: 11/08/2026, 15:59:38
class Solution {
    static class State{
        long time;
        int power;
        int node;
        State(long time,int power,int node){
            this.time=time;
            this.power=power;
            this.node=node;
        }
    }
    public long[] minTimeMaxPower(int n, int[][] edges, int power, int[] cost, int source, int target) {
        List<List<int[]>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int t=edge[2];
            adj.get(u).add(new int[]{v,t});
        }
        long[][]dist=new long[n][power+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],Long.MAX_VALUE);
        }
        PriorityQueue<State>pq=new PriorityQueue<>((a,b)->{
            if(a.time!=b.time){
                return Long.compare(a.time,b.time);
            }
            return Integer.compare(b.power,a.power);
        });
        dist[source][power]=0;
        pq.offer(new State(0,power,source));
        while(!pq.isEmpty()){
            State curr=pq.poll();
            long t=curr.time;
            int p=curr.power;
            int u=curr.node;
            if(u==target){
                return new long[]{t,(long)p};
            }
            if(t>dist[u][p]){
                continue;
            }
            for(int []neighbor:adj.get(u)){
                int v=neighbor[0];
                long edgeTime=neighbor[1];
                if(p>=cost[u]){
                    int np=p-cost[u];
                    long nt=t+edgeTime;
                    if(nt<dist[v][np]){
                        dist[v][np]=nt;
                        pq.offer(new State(nt,np,v));
                    }
                }
            }
        }
        return new long[]{-1,-1};
    }
}