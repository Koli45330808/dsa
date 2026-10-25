class Solution {
    public int minElement(int[] nums) {

        int result=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int sum=0;


            while(n!=0){
                int rem=n%10;
                sum=sum+rem;
                n=n/10;
            }

            result=Math.min(sum,result);


        }

        return result;
        
    }
}