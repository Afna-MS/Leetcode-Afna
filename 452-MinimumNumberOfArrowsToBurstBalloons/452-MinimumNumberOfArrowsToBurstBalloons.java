// Last updated: 11/08/2026, 16:08:54
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)-> Integer.compare(a[1],b[1]));
        int n=0;
        long end=Long.MIN_VALUE;
        for(int[] balloon : points){
            if(balloon[0]<=end)
            continue;
            else{
                n++;
                end =balloon[1];
            }
        }

        return n;

    }
}