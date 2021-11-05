class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if(rows==0) return false;
        int column =  matrix[0].length;
        if(column == 0) return false;
        
        int i=0,j=column-1;
        
        while(j>=0  && i<=rows - 1){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]<target){
                i++;
            }
            else j--;
        }
        
        return false;
        
    }
}