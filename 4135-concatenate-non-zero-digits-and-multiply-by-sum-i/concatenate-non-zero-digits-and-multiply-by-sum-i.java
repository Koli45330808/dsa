class Solution {
    public long sumAndMultiply(int n) {
       // String str=Integer.toString(n);
        //char ch[]=str.toCharArray();
        String ask="";

       
        int sum=0;
        while(n!=0){
            int rem=n%10;
            if(rem!=0){
            sum=sum+rem;
            ask=ask+rem;
            }
            n=n/10;

        }

        String ass = new StringBuilder(ask).reverse().toString();

        long m;
        if(ass.isEmpty()){
             m=0;
        }
        else{
            m= Integer.parseInt(ass);
        }

        //long m= Integer.parseInt(ask);
        
        long result=sum*m;

        return result;

        
    }
}