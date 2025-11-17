class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int m=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(m!=-1&&i-m-1<k){
                    return false;
                }
                
                    m=i;

                

            }
        }

        return true;
        
    }
}