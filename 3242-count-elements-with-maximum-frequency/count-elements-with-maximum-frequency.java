import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        // Map to store frequency of each number
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Find the max frequency
        int maxFreq = 0;
        for (int freq : freqMap.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        // Count total elements having the max frequency
        int total = 0;
        for (int freq : freqMap.values()) {
            if (freq == maxFreq) {
                total += freq;
            }
        }

        return total;
    }
}
