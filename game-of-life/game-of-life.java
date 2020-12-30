        int column= board[0].length;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
             
                if(board[i][j]==-1) 
                    board[i][j]=0;
                else if(board[i][j]==2) 
                    board [i][j]=1;
            }
        }
    }
    
    private int calculateNeighbourValue(int i , int j,int board[][]){
        
        return getValueAtIndex(i-1,j,board)+ getValueAtIndex(i+1,j,board) +
                getValueAtIndex(i,j+1,board)+ getValueAtIndex(i,j-1,board) +
                getValueAtIndex(i-1,j-1,board)+ getValueAtIndex(i+1,j+1,board) +
                getValueAtIndex(i+1,j-1,board)+ getValueAtIndex(i-1,j+1,board);
    }
    
    private int getValueAtIndex(int i,int j,int board[][] ){
        int row = board.length;
        int column= board[0].length;
        
        if(i<0 || i>row-1 || j<0 || j>column-1) 
            return 0;
        
        if( board[i][j]==0 || board[i][j]==2)
            return 0;
        
        if(board[i][j]==1 || board[i][j]==-1)
            return 1;
        
        return -1;
    }
}
