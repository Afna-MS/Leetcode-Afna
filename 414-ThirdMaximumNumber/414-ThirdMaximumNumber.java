// Last updated: 11/08/2026, 16:09:09
class Solution {
    public int thirdMax(int[] arr) {
        long max=Long.MIN_VALUE;
        long max2=Long.MIN_VALUE;
        long max3=Long.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max3=max2;
                max2=max;
                max=arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max){
                max3=max2;
                max2=arr[i];
            }
            else if(arr[i]>max3 && arr[i]!=max2 && arr[i]!=max){
                max3=arr[i];
            }
        }
        if(max3==Long.MIN_VALUE){
            return (int)max;
        }
        else{
            return (int)max3;
        }
    }
}