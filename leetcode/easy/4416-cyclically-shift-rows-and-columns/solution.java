class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] tempGrid = new int[n][n];
        int[][] finalGrid = new int[n][n];
        
       for (int i = 0; i < n; i++) {
            int shift = rowShift[i];
            for (int j = 0; j < n; j++) {
                int newCol = (j - shift + n) % n;
                tempGrid[i][newCol] = grid[i][j];
            }
        }
        
        for (int j = 0; j < n; j++) {
            int shift = colShift[j];
            for (int i = 0; i < n; i++) {
                int newRow = (i - shift + n) % n;
                finalGrid[newRow][j] = tempGrid[i][j];
            }
        }
        
        return finalGrid;
    }
}
