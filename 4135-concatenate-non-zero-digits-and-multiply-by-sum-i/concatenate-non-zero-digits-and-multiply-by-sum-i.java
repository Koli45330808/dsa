class Solution {
    public long sumAndMultiply(int n) {
        String str=Integer.toString(n);
        char ch[]=str.toCharArray();
        String ask="";

        for(int i=0;i<ch.length;i++){
            if(ch[i]!='0'){
                ask=ask+ch[i];

            }
        }
        int sum=0;
        while(n!=0){
            int rem=n%10;
            if(rem!=0){
            sum=sum+rem;
            }
            n=n/10;

        }

        long m=0;
        if(ask.isEmpty()){
             m=0;
        }
        else{
            m= Integer.parseInt(ask);
        }

        //long m= Integer.parseInt(ask);
        
        long result=sum*m;

        return result;

        
    }
}