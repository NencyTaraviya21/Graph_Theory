class AdjacencyGraph{
    public static void main(String[] args) {
        AdjacencyGraph ad = new AdjacencyGraph();
        int edgs[][]={{0,1},{1,2},{2,0}};
        int edgs2[][]={{0,1},{1,2},{1,3},{2,3},{3,0}};
        ad.adjacency(edgs);
        ad.adjacency(edgs2);
    }

    void adjacency(int[][] edgs){
        int v=edgs.length;
        int [][] adjMatrix = new int [v][v];

        for(int[]edg:edgs){
            int from  = edg[0];
            int end = edg[1];
            adjMatrix[from][end] = 1;  
        }
        for(int i=0; i<v;i++){
            System.out.println(i+"-->");
            for(int j=0;j<v;j++){
                if(adjMatrix[i][j] == 1){
                    System.out.println(j);
                }      
            }
            System.out.println();
        }
        
    }
}