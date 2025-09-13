class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        for(int i=0;i<=nums.length-1;i++){
            result=nums[i];
            break;



        }

        return result;
    }
}