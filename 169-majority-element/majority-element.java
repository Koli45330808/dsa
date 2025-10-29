class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int result=nums[n/2];
        return result;
        
    }
}