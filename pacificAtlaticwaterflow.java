class Solution {
    private int numRows;
    private int numCols;
    private int[][] landHeights;
    private static final int[][] DIRECTIONS = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return new ArrayList<>();
        }
        
        numRows = matrix.length;
        numCols = matrix[0].length;
        landHeights = matrix;
        
        Queue<int[]> pacificQueue = new LinkedList<>();
        Queue<int[]> atlanticQueue = new LinkedList<>();
        for(int i = 0; i < numRows; i++){
            pacificQueue.offer(new int[]{i,0});
            atlanticQueue.offer(new int[]{i,numCols -1});
        }
         for(int i = 0; i < numCols; i++){
            pacificQueue.offer(new int[]{0,i});
            atlanticQueue.offer(new int[]{numRows -1, i});
        }
        
        boolean[][] pacificReachable = bfs(pacificQueue);
        boolean[][] atlanticReachable = bfs(atlanticQueue);
        List<List<Integer>> commonCells = new ArrayList<>();
        for(int i = 0 ; i< numRows; i++){
            for(int j = 0; j < numCols; j++){
                if (pacificReachable[i][j] && atlanticReachable[i][j]){
                    commonCells.add(List.of(i,j));
                }
            }
        }
        return commonCells;
    }
    
    private boolean[][] bfs(Queue<int[]> queue){
        boolean[][] reachable = new boolean[numRows][numCols];
        while(!queue.isEmpty()){
            int[] cell = queue.poll();
            reachable[cell[0]][cell[1]] = true;
            for(int[] dir : DIRECTIONS){
                int newRow = cell[0] + dir[0];
                int newCol = cell[1]+ dir[1];
                if (newRow < 0 || newRow >= numRows || newCol < 0 || newCol >= numCols){
                    continue;
                }
                if(reachable[newRow][newCol]){
                    continue;
                }
                if (landHeights[newRow][newCol] < landHeights[cell[0]][cell[1]]){
                    continue;
                }
                
                queue.offer(new int[]{newRow,newCol});
                      
            }
        }
        return reachable;
    }
}