// Last updated: 11/08/2026, 16:01:13
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++)
        q.add(i);
        int time=0;
        while(!q.isEmpty()){
            int idx=q.poll();
            time++;
            tickets[idx]--;
            if(tickets[idx]>0)
            q.add(idx);
            if(idx==k && tickets[idx]==0)
            return time;
        }
        return time;
    }
}