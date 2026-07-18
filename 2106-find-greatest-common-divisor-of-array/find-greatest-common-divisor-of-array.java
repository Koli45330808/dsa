class Solution {
    public int findGCD(int[] nums) {

        Arrays.sort(nums);
        int a=nums[0];
        int ask=0;
        int b=nums[nums.length-1];
        for(int i=2;i<=b;i++){
            if(a%i==0 && b%i==0){
                ask=Math.max(ask,i);
            }
        }
        
        if(ask>1){
            return ask;
        }

        return 1;
    }
}