class Solution {
    private int direction[][]={{0,-1},{0,1},{1,0},{-1,0}};
    public int getMaximumGold(int[][] grid) {
        
        int row = grid.length;
        if(row == 0) return 0;
        int column = grid[0].length;
        int result = 0;
        for(int i =0;i<row;i++){
            for(int j=0;j<column ;j++){
                if(grid[i][j]>0){
                   int res = dfs(i,j,grid);
                    result = Math.max(result,res);
                }
            }
        }
        
        return result;
    }
    
    private int dfs(int i,int j, int grid[][]){
        
        if(i<0 || i>grid.length-1 || j<0 || j>grid[0].length-1 || grid[i][j]==0)
            return 0;
        
        
        int temp = grid[i][j];
        grid[i][j] = 0;
        int result = 0;
        for(int d=0;d<direction.length;d++)
        {
            int offset[] = direction[d];
            result = Math.max(result,dfs(i+offset[0],j+offset[1],grid));
        }
            
        grid[i][j]=temp;
        
        return result+temp;
    }
    
    
}
