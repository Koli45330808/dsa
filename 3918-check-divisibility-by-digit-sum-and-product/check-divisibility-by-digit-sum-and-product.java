class Solution {
    public boolean checkDivisibility(int n) {

      int sum=0;
      int producat=1;
      int ask=n;

        while(n!=0){
            int rem=n%10;
            sum=sum+rem;
            producat=producat*rem;
            n=n/10;
        }

        if(ask%(producat+sum)==0){
            return true;
        }


        return false;
        
    }
}