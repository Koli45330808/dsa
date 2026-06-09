class Solution {
    public long maxTotalValue(int[] nums, int k) {

        int ask=Integer.MAX_VALUE;
        int ss=0;

        for(int i=0;i<nums.length;i++){
            ask=Math.min(ask,nums[i]);
            ss=Math.max(ss,nums[i]);
        }

        long n=ss-ask;
        return k*n;
        
    }
}