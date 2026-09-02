class Solution {
    public boolean uniformArray(int[] nums1) {

        int odd = 0;
        int even = 0;

        for (int num : nums1) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Already uniform
        if (odd == 0 || even == 0) {
            return true;
        }

        // Both parities exist.
        // If there are at least 2 elements of either parity,
        // we can use their difference to make an even value.
        if (odd >= 2 || even >= 2) {
            return true;
        }

        // Exactly one odd and one even
        // Use difference for one and original for the other.
        return true;
    }
}