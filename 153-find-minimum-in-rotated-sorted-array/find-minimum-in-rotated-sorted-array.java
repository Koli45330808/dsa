class Solution {
    public int findMin(int[] nums) {
        

        int result=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            result=Math.min(nums[i],result);
        }

        return result;

       // Arrays.sort(nums);
       // int ask=nums[0];
       // return ask;
        
    }
}