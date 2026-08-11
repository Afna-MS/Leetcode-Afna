// Last updated: 11/08/2026, 16:02:29
class Solution {
    public int dayOfYear(String date) {
        String year=date.substring(0,4);
        String month=date.substring(5,7);
        String day=date.substring(8,10);
        int yr=Integer.parseInt(year);
        int mon=Integer.parseInt(month);
        int day2=Integer.parseInt(day);
        int arr[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int ans=day2;
        if(mon>2){
        if(yr%4==0 && yr%100!=0)
            ans++;
        else if(yr%400==0)
            ans++;
        }
        for(int i=0;i<mon;i++){
            ans=ans+arr[i];
        }
        return ans;
    }
}