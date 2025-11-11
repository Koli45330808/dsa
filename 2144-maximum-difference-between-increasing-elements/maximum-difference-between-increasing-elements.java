class Solution {
    public int maximumDifference(int[] nums) {
        int ask=nums[0];
        int result=0;

        for(int j=1;j<=nums.length-1;j++){
            if(ask>nums[j]){
                ask=nums[j];
            }

            result=Math.max(result,(nums[j]-ask));



        }
 
       if(result>0){
        return result;
       }
       else{
        return -1;
       }
        
    }
}