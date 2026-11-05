class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int count = 0;

        for (int j = 0; j < arr1.length; j++) {

            boolean flag = true;

            for (int i = 0; i < arr2.length; i++) {

                int a = Math.abs(arr1[j] - arr2[i]);

                if (a <= d) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                count++;
            }
        }

        return count;
    }
}