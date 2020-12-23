class Solution {
    public int pivotIndex(int[] nums) {
  
        int n = nums.length;
        if(n == 1) return 0;
        if(n == 0) return -1;
        
        int leftSum[]=new int[n+2];
        int rightSum[] = new int[n+2];
        
        int sum=0;
        for(int i= 1;i<=n;i++){
            sum+=nums[i-1];
            leftSum[i]+=sum;
        }
        
        sum=0;
        for(int i=n;i>=1;i--){
            sum+=nums[i-1];
            rightSum[i]+=sum;
        }
        
        
        
        for(int i= 0;i<=n+1;i++){
            System.out.println(leftSum[i]+"---"+rightSum[i]);
        }
        System.out.println("===");
      
        
        for(int i=1;i<=n;i++){
            if(leftSum[i-1]==rightSum[i+1])
                return i-1;
        }
        
        return -1;
    }
}
//1,7,3,6,5,6
    
//1,8,11,17,22,28
//28,27,20,17,11,6
 /*   -1,-1,-1,0,1,1
    -1,-2,-3,0,-2,-1
    -1,0,1,2,2,1    
   */ 
