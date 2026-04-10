class Solution {
    public int minimumDistance(int[] nums) {
        
        int result=Integer.MAX_VALUE;
        int ask=Integer.MAX_VALUE;

        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        int a=Math.abs(i-j);
                        int b=Math.abs(j-k);
                        int c=Math.abs(k-i);
                        int sum=a+b+c;
                        result=Math.min(result,sum);


                    }
                }
            }
        }

        if(result==ask){
            return -1;
        }

        return result;
        
    }
}