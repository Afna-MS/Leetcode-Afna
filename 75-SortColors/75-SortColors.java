// Last updated: 11/08/2026, 16:15:06
class Solution {
    public void sortColors(int[] nums) {
        int i,c1=0,c2=0,n=nums.length;
        for(i=0;i<n;i++){ 
	        if(nums[i]==0) 
			  c1++;
		    else if(nums[i]==1)
              c2++;
        }
		for(i=0;i<c1;i++) 
			nums[i]=0;
		for(i=c1;i<c1+c2;i++) 
			nums[i]=1;
        for(i=c1+c2;i<n;i++) 
			nums[i]=2;
	
		

	}

}


    