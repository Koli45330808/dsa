class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Assume first string is the prefix
        String prefix = strs[0];

        // Compare prefix with every other string
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                // Remove the last character from prefix
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}