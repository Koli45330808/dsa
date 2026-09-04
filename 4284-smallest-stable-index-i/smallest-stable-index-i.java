class Solution {
    public int firstStableIndex(int[] nums, int k) {

        if(nums.length==1 ){
            return 0;
        }
        //if(nums.length==1 && nums[0]<k){
          //  return k;
        //}
        

        for(int i=0;i<nums.length;i++){
            
            int ask=Integer.MAX_VALUE;
            for( int j=i;j<nums.length;j++){
                ask=Math.min(ask,nums[j]);
        }


            int ass=0;
        for(int h=0;h<=i;h++){
            ass=Math.max(ass,nums[h]);
        }

        int res=ass-ask;
        if(res<=k){
            return i;
        }
        }

        return -1;

        
    }
}