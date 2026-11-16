class Solution {
    public String digitSum(String s, int k) {

        

        while(s.length()>k){
            StringBuilder sc=new StringBuilder();

            for(int i=0;i<s.length();i+=k){

                String min=s.substring(i,Math.min(i+k,s.length()));
                int sum=0;

                for(int j=0;j<min.length();j++){
                    sum=sum+min.charAt(j)-'0';

                }

                sc.append(sum);
            }

            s=sc.toString();

        }




        return s;
        
    }
}