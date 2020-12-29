class Solution {
    public int maxProduct(int[] nums) {
        
        int result = nums[0];
        int maxProductUntilNow = nums[0];
        int minProductUntilNow = nums[0];
        
        
        for(int i=1;i<nums.length;i++){
            
           
            
            int temp = maxProductUntilNow;
            
         //   int newMaxProduct = maxProductUntilNow*nums[i];
         //   int newMinProduct = minProductUntilNow*nums[i];
            
             maxProductUntilNow = Math.max(nums[i],Math.max(maxProductUntilNow*nums[i],minProductUntilNow*nums[i]));
             minProductUntilNow = Math.min(nums[i],Math.min(temp*nums[i],minProductUntilNow*nums[i]));
            
            
            result = Math.max(maxProductUntilNow,result);
            
            System.out.println("i "+i+" maxProductUntilNow "+maxProductUntilNow+" minProductUntilNow "+minProductUntilNow+" Result  "+ result);
       //     newMaxProduct = Math.max(newMaxHere,newMaxProduct);
       //     newMinProduct = Math.min(newMinHere,newMinProduct);
        }
        
        return result;
    }
}
