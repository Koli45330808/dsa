class Solution {
    public int missingMultiple(int[] nums, int k) {


        Arrays.sort(nums);

        int m=nums[nums.length-1];

        for(int i=1;i<=m+1;i++){
            int v=i*k;
            int l=0;
            for(int j=0;j<nums.length;j++){
                if(v==nums[j]){
                    l++;
                }

            }

            if(l==0){
                return v;

            }
        }

        return 1;
        
    }
}