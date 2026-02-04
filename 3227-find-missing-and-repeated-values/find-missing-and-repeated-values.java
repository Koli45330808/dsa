class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        ArrayList<Integer> sc=new ArrayList<>();

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                sc.add(grid[i][j]);
            }
        }

        Collections.sort(sc);
        int n=sc.size();
        int temp[]=new int[n];
        for(int i=0;i<sc.size();i++){
            temp[i]=sc.get(i);
        }
        int m=temp.length;
        int l=-1;
        int k=-1;

        for(int i=1;i<=m;i++){
            int count=0;
        
            for(int j=0;j<temp.length;j++){
                if(i==temp[j]){
                    count++;
                }
                

            }
            if(count>1){
                l=i;
            }
            if(count==0){
                k=i;
            }
        }
        


        
        return new int[]{l,k};
    }
}