class Solution {
    public char processStr(String s, long k) {

        int n = s.length();
        long[] len = new long[n + 1];

        // Length after each operation
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                len[i + 1] = len[i] + 1;
            } else if (ch == '*') {
                len[i + 1] = Math.max(0, len[i] - 1);
            } else if (ch == '#') {
                len[i + 1] = len[i] * 2;
            } else { // '%'
                len[i + 1] = len[i];
            }

            // Prevent overflow
            len[i + 1] = Math.min(len[i + 1], Long.MAX_VALUE / 2);
        }

        if (k < 0 || k >= len[n]) {
            return '.';
        }

        // Work backwards
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            long prevLen = len[i];
            long currLen = len[i + 1];

            if (ch >= 'a' && ch <= 'z') {
                if (k == prevLen) {
                    return ch;
                }
            }
            else if (ch == '*') {
                // Before '*' one extra character existed.
                if (currLen < prevLen) {
                    // Deleted character was at index prevLen - 1.
                    // Since k is always < currLen, nothing changes.
                }
            }
            else if (ch == '#') {
                if (k >= prevLen) {
                    k -= prevLen;
                }
            }
            else { // '%'
                k = currLen - 1 - k;
            }
        }

        return '.';
    }
}