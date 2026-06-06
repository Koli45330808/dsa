class Solution {
    public int[] leftRightDifference(int[] nums) {
        int temp[]=new int[nums.length];
        ArrayList<Integer> ss=new ArrayList<>();


        for(int i=0;i<nums.length;i++ ){
            int sum=0;
            for(int j=nums.length-1;j>=i+1;j--){
                sum=sum+nums[j];
            }
             int ask=0;
            for(int k=0;k<=i-1;k++){
                ask=ask+nums[k];

            }

            int result=Math.abs(ask-sum);
            ss.add(result);
        }

        for(int m=0;m<ss.size();m++){
            temp[m]=ss.get(m);
        }

        return temp;
        
    }
}