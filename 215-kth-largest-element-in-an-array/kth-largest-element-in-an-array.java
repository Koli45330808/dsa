class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);

        int sum=nums[nums.length-k];

        return sum;
        
    }
}