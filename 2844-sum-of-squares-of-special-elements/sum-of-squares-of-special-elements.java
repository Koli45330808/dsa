class Solution {
    public int sumOfSquares(int[] nums) {

        int sum=0;
        int n=nums.length;
        int m=1;

        for(int i=0;i<nums.length;i++){
            if(n%m==0){
                sum=sum+nums[i]*nums[i];
                
            }
            m++;
        }

        return sum;
        
    }
}