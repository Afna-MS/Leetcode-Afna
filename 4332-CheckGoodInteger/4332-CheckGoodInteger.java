// Last updated: 11/08/2026, 15:59:25
class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum=0;
        int squareSum=0;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            digitSum += digit;
            squareSum += (digit*digit);
            temp/=10;
        }
        return (squareSum-digitSum)>=50;
    }
}