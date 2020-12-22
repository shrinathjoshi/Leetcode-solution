class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;
        int left =0;
        int right = n-1;
        int maxWater =0;
        while(left<right){
            int currentWater = (right - left)* Math.min(height[left],height[right]);
            
            if(currentWater>maxWater){
                maxWater=currentWater;
            }
            
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        
        return maxWater;
    }
}
