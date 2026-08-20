class Solution {
    public int[] resultArray(int[] nums) {

        ArrayList<Integer> sc = new ArrayList<>();
        ArrayList<Integer> ss = new ArrayList<>();

        // First element → sc
        sc.add(nums[0]);

        // Second element → ss
        ss.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {

            int a = sc.get(sc.size() - 1);
            int b = ss.get(ss.size() - 1);

            if (a > b) {
                sc.add(nums[i]);
            } else {
                ss.add(nums[i]);
            }
        }

        int[] temp = new int[nums.length];

        int v = 0;

        // Copy sc
        for (int i = 0; i < sc.size(); i++) {
            temp[v] = sc.get(i);
            v++;
        }

        // Copy ss
        for (int i = 0; i < ss.size(); i++) {
            temp[v] = ss.get(i);
            v++;
        }

        return temp;
    }
}