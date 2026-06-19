class Solution {
    public int largestAltitude(int[] gain) {



        int ask=0;
        int result=0;

        for(int akash:gain){
            ask=ask+akash;
            result=Math.max(result,ask);


        }


        return result;
        
        
    }
}