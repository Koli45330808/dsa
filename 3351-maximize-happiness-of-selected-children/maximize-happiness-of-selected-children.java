class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {

        Arrays.sort(happiness);
        int count=0;
        int a=0;
        long sum=0;
        for(int i=happiness.length-1;i>=0;i--){
            int ask=happiness[i]-a;
            if(ask>0 && count<k){
                sum=sum+ask;

            }
            a++;
            count++;
        }

        return sum;
        
    }
}