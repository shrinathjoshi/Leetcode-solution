class Solution {
    public int findMin(int[] nums) {
        int l =0,r=nums.length-1;
        
        while(l<=r){
            int mid = l+(r-l)/2;
            int value = nums[mid];
            
            if(value<nums[r])
                r=mid;
            else if(value>nums[r])
                l=mid+1;
            else return nums[r];
        }
        
        return -1;
    }
}
