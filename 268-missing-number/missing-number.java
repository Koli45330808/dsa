class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        while(n>=i){
            
        
        for(int j=0;j<n;j++){
            if(nums[j]!=i){
                return i;
            }
            i++;
        }
        
        
        }

        return -1;
        
    }
}