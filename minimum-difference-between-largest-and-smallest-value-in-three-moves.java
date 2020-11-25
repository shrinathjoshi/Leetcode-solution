class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        if (n < 5) return 0;
        int result = Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        for(int i=0;i<4;i++){
            result=Math.min(result,nums[n-4+i] - nums[i]);
        }
        
        return result;
    }
}
