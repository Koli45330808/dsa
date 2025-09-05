class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int k = 1; k <= 60; k++) {
    long x = (long)num1 - (long)k * num2;

    if (x < 0) continue;  // invalid if negative

    int setBits = Long.bitCount(x);  // count 1s in binary

    if (setBits <= k && k <= x) {
        return k;  // valid if enough bits and value
    }
}
return -1;

        
    }
}