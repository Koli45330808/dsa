class Solution {
    public int maxProduct(int[] nums) {

        Arrays.sort(nums);
        int m=nums[nums.length-1]-1;
        int n=nums[nums.length-2]-1;

        int ask=m*n;

       return ask;
    }
}