class Solution {
    public void bfsFun(int node, int visited[], ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        visited[node]=1;

        while(!q.isEmpty()){
            int cnode=q.poll();

            for(int a: adj.get(cnode)){
                if(visited[a] == 0){
                    visited[a]=1;
                    q.add(a);
                }
            }
        }
    }


    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0; i<isConnected.length; i++){
            adj.add(new ArrayList<>());

        }
        for(int i=0; i<isConnected.length; i++){
            for(int j=0; j<isConnected.length; j++){
                if(isConnected[i][j] == 1){
                    adj.get(i).add(j);
                }
            }
        }

        //
        int visited[]=new int[adj.size()];
        int count=0;

        for(int i=0; i<visited.length; i++){
            if(visited[i] == 0){
                count++;
                bfsFun(i, visited, adj);
            }
        }
        return count;
    }
}

  
    
