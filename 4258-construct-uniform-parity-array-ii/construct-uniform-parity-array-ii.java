class Solution {
    public boolean uniformArray(int[] nums1) {

        int min = nums1[0];

        // Find minimum element
        for (int i = 1; i < nums1.length; i++) {
            min = Math.min(min, nums1[i]);
        }

        // If minimum is odd, we can make every element odd
        if (min % 2 != 0) {
            return true;
        }

        // Minimum is even.
        // Every element must be even.
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}