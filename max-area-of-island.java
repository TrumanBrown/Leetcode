class Solution {
    
    public int dfs(int[][]grid, int row, int col)
    {
        int numRows=grid.length;
        int numCols=grid[0].length;
        int count=0;
        
        if(row< 0 || row >=numRows || col < 0 || col >= numCols || grid[row][col]==0)
        {
            return 0;
        }
        
        grid[row][col]=0;
        count=1;
        count += dfs(grid, row-1, col);
        count += dfs(grid, row+1, col);
        count += dfs(grid, row, col-1);
        count += dfs(grid, row, col+1);
        return count;
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        if(grid==null || grid.length==0)
        {
            return 0;
        }
        
        int area=0;
        int numRows=grid.length;
        int numCols=grid[0].length;
        int max=0;
        for(int i=0; i<numRows; i++)
        {
            for(int j=0; j< numCols; j++)
            {
                if(grid[i][j]==1)
                {
                    area=dfs(grid, i, j);
                    if(area>max)
                    {
                        max=area;
                    }
                }
            }
        }
        
        return max;
    }
}
