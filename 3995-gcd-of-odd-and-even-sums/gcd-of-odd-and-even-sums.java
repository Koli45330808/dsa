class Solution {
    public int gcdOfOddEvenSums(int n) {
        int m=n+n;
        int sum=0;
        int ask=0;
        for(int i=1;i<=m;i++){
            if(i%2==0){
                sum=sum+i;
            }
            else{
                ask=ask+i;
            }
        }
        int result=1;

        for(int i=2;i<=m;i++){
            if(sum%i==0 && ask%i==0){
                result=Math.max(result,i);

            }
        }

        return result;
        
    }
}