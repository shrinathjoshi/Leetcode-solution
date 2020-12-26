class Solution {
    public boolean canJump(int[] nums) {
        
        int n = nums.length;
        if(n==0)
            return true;
        
        boolean dp[]=new boolean[n];
        
        dp[n-1]=true;
        
        for(int i=n-2;i>=0;i--){
            
            int value = nums[i];
            for(int j=1;j<=value && i+j<=n-1;j++){
                if(dp[i+j]){
                    dp[i]=true;
                }
            }
            
        }
        
        return dp[0];
    }
}
