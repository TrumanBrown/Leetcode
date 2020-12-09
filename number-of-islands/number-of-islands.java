class Solution {
    
    
    void dfs(char[][] grid, int row, int col) //depth first search, this will set all neighboring 1s (AKA the island) to 0s
    {
        int numRows=grid.length;
        int numColumns=grid[0].length;
​
        if(row<0 || col<0 || row>=numRows || col>=numColumns || grid[row][col]=='0')
        {
            return;
        }
​
        grid[row][col]='0';
        dfs(grid, row+1, col);
        dfs(grid, row-1, col);
        dfs(grid, row, col+1);
        dfs(grid, row, col-1);
        return;
    }
    
    public int numIslands(char[][] grid) {
       
        if(grid==null || grid.length==0)
        {
            return 0;
        }
            
        
        int numIslands=0;
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[i].length; j++)
            {
                if(grid[i][j]=='1')
                {
                    numIslands++;
                    dfs(grid, i, j); //will set all neighboring '1's to '0's
                }
            }
        }
        return numIslands;
    }
}
