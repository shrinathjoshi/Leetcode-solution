class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;   
        int column = matrix[0].length;
        
​
        boolean isZeroInFirstRow = false;
        boolean isZeroInFirstColumn = false;
        
        if(matrix[0][0]==0) 
            isZeroInFirstRow=isZeroInFirstColumn =true;
    
        for(int i=1;i<column;i++){
            if(matrix[0][i]==0)
                isZeroInFirstRow=true;
        }
        
        for(int i=1;i<row;i++){
            if(matrix[i][0]==0)
                isZeroInFirstColumn=true;
        }
        
        
        
        for(int i =0;i<row;i++){
            for(int j=0;j<column; j++){
                if(matrix[i][j]==0)
                    matrix[i][0]=matrix[0][j]=0;
            }
        }
        
        System.out.println(isZeroInFirstRow+" "+isZeroInFirstColumn);
