class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        if(nums.length==1){
            return 1;
        }

        int a=1;
        int ask=0;

        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i]<nums[i+1]){
                a++;
                
            }
            else{

                a=1;
            }
            ask=Math.max(ask,a);
            
        }

        int b=1;

        int res=0;

        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i]>nums[i+1]){
                b++;
                
            }
            else{

                b=1;
            }
            res=Math.max(res,b);
            
        }

        int shiv=Math.max(res,ask);

        return shiv;
        
    }
}