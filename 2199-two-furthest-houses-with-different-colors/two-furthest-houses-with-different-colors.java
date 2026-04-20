class Solution {
    public int maxDistance(int[] colors) {

        int ask=0;
        for(int i=0;i<colors.length-1;i++){
            for(int j=i+1;j<colors.length;j++){
                int res=0;
                if(colors[i]!=colors[j]){
                    res=j-i;

                }
                ask=Math.max(res,ask);
            }
        }

        return ask;
        
    }
}