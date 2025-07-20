class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        // Initialize the answer array with the same length
        int[] result = new int[length];
      
        // Initialize 'leftProduct' to 1, to represent the product of elements to the left of the current index
        int leftProduct = 1;
        // Loop through the array from left to right
        for (int i = 0; i < length; i++) {
            // Set the current element in the result array to 'leftProduct'
            result[i] = leftProduct;
            // Multiply 'leftProduct' by the current element in nums for the next iteration (prefix product)
            leftProduct *= nums[i];
        }
      
        // Initialize 'rightProduct' to 1, to represent the product of elements to the right of the current index
        int rightProduct = 1;
        // Loop through the array from right to left
        for (int i = length - 1; i >= 0; i--) {
            // Multiply the current element in the result array by 'rightProduct'
            result[i] *= rightProduct;
            // Multiply 'rightProduct' by the current element in nums for the next iteration (suffix product)
            rightProduct *= nums[i];
        }
      
        // Return the final product except self array
        return result;
    }
}