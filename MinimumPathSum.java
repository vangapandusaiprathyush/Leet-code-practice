//time complexity - O(m*n)
//space complexity - O(m*n)

class Solution {
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dpArray = new int[rows][cols];
        for(int p=rows-1;p>=0;p--){
            for(int q=cols-1;q>=0;q--){
                if(p == rows - 1 && q!= cols-1){
                    dpArray[p][q] = grid[p][q] + dpArray[p][q+1];
                }
                else if(p != rows-1 && q == cols - 1){
                    dpArray[p][q] = grid[p][q] + dpArray[p+1][q];
                }
                else if(p != rows - 1 && q!= cols){
                    dpArray[p][q] = grid[p][q] + Math.min(dpArray[p+1][q],dpArray[p][q+1]); 
                }
                else dpArray[p][q] = grid[p][q];
            }
        }
        return dpArray[0][0];
    }
}
