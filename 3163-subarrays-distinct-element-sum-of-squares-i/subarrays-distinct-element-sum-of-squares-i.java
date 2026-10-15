import java.util.*;

class Solution {
    public int sumCounts(List<Integer> nums) {

        int temp[] = new int[nums.size()];

        for (int i = 0; i < nums.size(); i++) {
            temp[i] = nums.get(i);
        }

        int sum = 0;

        for (int i = 0; i < temp.length; i++) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < temp.length; j++) {

                set.add(temp[j]);

                int m = set.size();

                sum = sum + m * m;
            }
        }

        return sum;
    }
}