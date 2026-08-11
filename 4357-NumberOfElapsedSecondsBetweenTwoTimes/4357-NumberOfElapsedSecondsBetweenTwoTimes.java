// Last updated: 11/08/2026, 15:58:32
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        return toSeconds(endTime)-toSeconds(startTime);
    }
    private int toSeconds(String time){
        int hh=Integer.parseInt(time.substring(0,2));
        int mm=Integer.parseInt(time.substring(3,5));
        int ss=Integer.parseInt(time.substring(6,8));
        return hh*3600+mm*60+ss;
    }
}