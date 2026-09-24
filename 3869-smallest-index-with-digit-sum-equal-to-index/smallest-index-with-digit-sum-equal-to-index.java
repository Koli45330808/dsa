class Solution {
    public int smallestIndex(int[] nums) {
        

        int res=Integer.MAX_VALUE;
        int ask=res;

        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int sum=0;
            while(n!=0){
                int rem=n%10;
                sum=sum+rem;
                n=n/10;
            }

            if(sum==i){
                res=Math.min(res,i);
            }
        }


        if(res==ask){
            return -1;
        }
        return res;
    }
}