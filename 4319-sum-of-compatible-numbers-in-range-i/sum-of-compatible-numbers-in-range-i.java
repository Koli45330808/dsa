class Solution {
    public int sumOfGoodIntegers(int n, int k) {

        int sum = 0;

        for (int i = 1; i <= n+k; i++) {
            int a = Math.abs(n - i);

            if (a <= k && (n & i) == 0) {
                sum += i;
            }
        }

        return sum;
    }
}