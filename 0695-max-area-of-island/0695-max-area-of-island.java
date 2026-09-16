class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int max = 0;
        int area;
        for(int i=0; i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == 1){
                    area = dfs(grid,i,j);
                    max = Math.max(max,area);
                }
            }
        }
        return max; 
    }
    public static int dfs(int[][] grid, int row, int col){
        if(row <0 || col <0 || row>=grid.length || col >=grid[0].length || grid[row][col]==0) {
            return 0;
        }
        grid[row][col]=0;
        int maxarea=1;
        maxarea+=dfs(grid,row+1,col);
        maxarea+=dfs(grid,row-1,col);
        maxarea+=dfs(grid, row, col - 1);
        maxarea+=dfs(grid,row,col+1);
        return maxarea;


    }
}