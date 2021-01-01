class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        
        int n = nums.length;
        int windowStart=0;
        int windowEnd =0;
        
        int currentSum =0;
        int result =Integer.MAX_VALUE;
        
        while(windowEnd<n){
            currentSum +=nums[windowEnd];
            
            while(windowStart<n && currentSum>=s){
                result = Math.min(result,windowEnd-windowStart+1);
                currentSum-=nums[windowStart++];
            }
            
            windowEnd++;
        }
        
        return result==Integer.MAX_VALUE?0:result;
    }
}
