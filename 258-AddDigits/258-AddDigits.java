// Last updated: 11/08/2026, 16:10:55
class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>=10){
            sum=0;
            while(num!=0){
                int d=num%10;
                sum+=d;
                num/=10;
            }
            num=sum;
        }
        return num;

    }
}