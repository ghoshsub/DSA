class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int visited[][] = new int[grid.length][grid[0].length];
        int dr[]={-1, 1, 0, 0};
        int dc[]={0, 0, -1, 1};
        int count=0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1' && visited[i][j] == 0){
                    count++;

                    Queue<int[]> q=new LinkedList<>();
                    q.add(new int[]{i, j});

                    visited[i][j]=1;

                    while(!q.isEmpty()){
                        int current[] = q.poll();

                        int r=current[0];
                        int c=current[1];
                         for(int k = 0; k < 4; k++) {

                            int nr = r + dr[k];
                            int nc = c + dc[k];

                            if(nr >= 0 && nr < m &&
                               nc >= 0 && nc < n &&
                               grid[nr][nc] == '1' &&
                               visited[nr][nc] == 0) {

                                visited[nr][nc] = 1;

                                q.add(new int[]{nr, nc});
                            }
                        }
                    }

                } 
            }
            
        }

    return count;
    }
}