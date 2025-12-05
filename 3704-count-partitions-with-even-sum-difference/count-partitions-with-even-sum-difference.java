class Solution {
    public int countPartitions(int[] nums) {
        int n=1;
        int m=0;
        int akash=0;
    
        while(m<=nums.length-1 && n<=nums.length){
            int sum=0;
            for(int i=0;i<=m;i++){
                sum=sum+nums[i];
            }

            int count=0;
            for(int j=n;j<=nums.length-1;j++){
                count=count+nums[j];

            }
            n++;
            m++;
             int ask=sum-count;
             if(ask%2==0){
                akash++;
             }

        }
        if(akash>0){
            return akash-1;
        }


        return akash;

        
    }
}