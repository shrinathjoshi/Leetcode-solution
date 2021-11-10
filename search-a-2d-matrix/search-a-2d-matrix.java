class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if(rows==0) return false;
        int column =  matrix[0].length;
        if(column == 0) return false;
        
        int left =0;
        int right = rows*column -1;
        
        
        while(left <= right){
            //int mid = left + (right - left)/2;
            int mid = (left+right) >>> 1;
            int rowMid = mid/column;
            int columnMid = mid%column;
            
            int value = matrix[rowMid][columnMid];
            
            if(value == target){
                return true;
            }
            else if(value<target) {
                left = mid+1;
            }
            else
                right = mid-1;
        }
        
        return false;
    }
}