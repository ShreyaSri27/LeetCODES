class Solution {
    
    
    public void find(char[][] grid,int[][] visited,int i,int j){
        
        
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0'||visited[i][j]==1){
            return;
        }
        visited[i][j]=1;
        
        find(grid,visited,i+1,j);
        find(grid,visited,i,j+1);
        find(grid,visited,i-1,j);
        find(grid,visited,i,j-1);
        
    }
    public int numIslands(char[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        int[][] visited=new int[m][n];
        
        int count=0;
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                
                if(grid[i][j]=='1'&&visited[i][j]==0){
                    
                    find(grid,visited,i,j);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    
}