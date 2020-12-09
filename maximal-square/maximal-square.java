class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][] areas=new int[matrix.length][matrix[0].length];
        int max=0;
        for(int i=0;i<areas.length; i++)
        {
            for(int j=0;j<areas[0].length; j++)
            {
                if(matrix[i][j]=='1')
                    areas[i][j]=1;
                else
                    areas[i][j]=0;
            }
        }
        for(int i=0; i<areas.length; i++)
        {
            if(areas[i][0]==1)
                max=1;
        }
        for(int i=0; i<areas[0].length; i++)
        {
            if(areas[0][i]==1)
                max=1;
        }
        for(int i=1; i<areas.length; i++)
        {
            for(int j=1; j<areas[0].length; j++)
            {
                if(areas[i][j]>0)
                {
                    areas[i][j]+=Math.min(Math.min(areas[i-1][j], areas[i][j-1]), areas[i-1][j-1]);
                    max=Math.max(max, areas[i][j]);
                }
            }
        }
    
        return max*max;
    }
}
