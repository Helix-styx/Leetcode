class Solution {
    public void dfs(char[][] grid, int i, int j,int n, int m){
        if(grid[i][j]=='0') return;
        
        grid[i][j] = '0';
        if(i-1>=0) dfs(grid,i-1,j,n,m);
        if(j-1>=0) dfs(grid,i,j-1,n,m);
        if(i+1<n) dfs(grid,i+1,j,n,m);
        if(j+1<m) dfs(grid,i,j+1,n,m);
        
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int island = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0 ; j<m; j++){
                if(grid[i][j]=='1'){
                    island++;
                    dfs(grid,i,j,n,m);
                }
            }
        }
        return island;
    }
}