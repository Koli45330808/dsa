class Solution {
    public int maximumGap(int[] nums) {

        if(nums.length==0){
            return 0;
        }

        Arrays.sort(nums);
        int result=0;

        for(int i=1;i<nums.length;i++){
            int ask=nums[i]-nums[i-1];
            result=Math.max(result,ask);



        }
        

        return result;
    }
}