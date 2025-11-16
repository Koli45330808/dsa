class Solution {
    public int numSub(String s) {
        long count = 0; // long to avoid overflow
        long consecutive = 0;
        int mod = 1000000007;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                consecutive++;
            } else {
                count = (count + (consecutive * (consecutive + 1)) / 2) % mod;
                consecutive = 0;
            }
        }

        // Add last group if string ends with '1'
        count = (count + (consecutive * (consecutive + 1)) / 2) % mod;

        return (int) count;
    }
}
