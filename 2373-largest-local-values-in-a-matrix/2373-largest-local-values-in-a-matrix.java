class Solution {
    public int findMax(int[][] grid,int startRow,int startCol) {
        int maxval=Integer.MIN_VALUE;
        for(int i=startRow; i<startRow+3;i++){
            for(int j=startCol; j<startCol+3;j++){
                maxval=Math.max(maxval,grid[i][j]);
            }
        }
        return maxval;
    }
    public int[][] largestLocal(int [][] grid){
        int n =grid.length;
        int res[][] = new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0; j<n-2;j++){
                res[i][j] =findMax(grid,i,j);
            }
        }
        return res;
    }
}