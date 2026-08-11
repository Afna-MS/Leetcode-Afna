// Last updated: 11/08/2026, 15:59:53
class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        Arrays.sort( occupiedIntervals,(a,b)->Integer.compare(a[0],b[0]));
        List<List<Integer>>ans=new ArrayList<>();
        int s= occupiedIntervals[0][0];
        int e= occupiedIntervals[0][1];
        for(int i=1;i< occupiedIntervals.length;i++){
            if( occupiedIntervals[i][0]<=e+1){
                e=Math.max(e, occupiedIntervals[i][1]);
            }else{
                if(e<freeStart||s>freeEnd){
                    ans.add(Arrays.asList(s,e));
                }else{
                    if(s<freeStart){
                         ans.add(Arrays.asList(s,freeStart-1));
                    }
                    if(e>freeEnd){
                         ans.add(Arrays.asList(freeEnd+1,e));
                    }
                }
                s=occupiedIntervals[i][0];
                e=occupiedIntervals[i][1];
            }
        }
        if(e<freeStart||s>freeEnd){
            ans.add(Arrays.asList(s,e));
        }else{
            if(s<freeStart){
                ans.add(Arrays.asList(s,freeStart-1));
            }
            if(e>freeEnd){
                ans.add(Arrays.asList(freeEnd+1,e));
            }
        }
        return ans;
    }
}