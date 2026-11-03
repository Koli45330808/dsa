class Solution {
    public int minMoves(int[] nums) {

        Arrays.sort(nums);
        int n=nums[nums.length-1];
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            sum=sum+Math.abs(n-nums[i]);


        }

        return sum;
        
    }
}