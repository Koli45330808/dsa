class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            int ask=i*i;
            for(int j=1;j<=n;j++){
                int ss=j*j;
                for(int k=1;k<=n;k++){
                    int sum=k*k;
                    int as=ask+ss;
                    if(i!=j && j!=k && as==sum){
                        count++;

                    }

                }
            }
        }

        return count;
        
    }
}