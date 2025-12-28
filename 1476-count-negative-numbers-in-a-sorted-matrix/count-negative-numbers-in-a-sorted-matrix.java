class Solution {
    public int countNegatives(int[][] grid) {

        int count=0;
       // int n=grid[0].length;

        for(int i=0;i<grid.length;i++){
            int n=grid[i].length;
            for(int j=0;j<n;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }

        return count;
        
    }
}