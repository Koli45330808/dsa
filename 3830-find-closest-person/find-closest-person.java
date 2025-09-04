class Solution {
    public int findClosest(int x, int y, int z) {

        int result=Math.abs(x-z);

        int ask=Math.abs(y-z);

        if(result==ask){
            return 0;
        }

        if(result<ask){
            return 1;
        }

        else{
            return 2;
        }
        
    }
}