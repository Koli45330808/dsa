class Solution {
    public int missingInteger(int[] nums) {

        // Step 1: Find sequential prefix sum
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        // Step 2: Find the smallest integer >= sum
        // that is not present in nums
        Arrays.sort(nums);

        for (int num : nums) {
            if (num == sum) {
                sum++;
            }
        }

        return sum;
    }
}