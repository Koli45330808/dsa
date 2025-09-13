class Solution {
    public int maxFreqSum(String s) {
        
        StringBuilder  sc=new StringBuilder();
        StringBuilder ss=new StringBuilder();

        for(int i=0;i<=s.length()-1;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                sc.append(ch);

            }

            else{
                ss.append(ch);
            }
        }
       
        
        int result=0;

    
      for(int i=0;i<=ss.length()-1;i++){
        char c=ss.charAt(i);
        int count=0;
        for(int j=0;j<=ss.length()-1;j++){
            char cc=ss.charAt(j);
            if(c==cc){
               count++;
            }

        }
        result=Math.max(result, count);
      }
    
     
      int atish=0;

      for(int k=0;k<=sc.length()-1;k++){
        char ask=sc.charAt(k);
         int sum=0;
        for(int h=0;h<=sc.length()-1;h++){
            char ch=sc.charAt(h);
            if(ask==ch){
                sum++;

            }
        }
       atish= Math.max(atish, sum);
      }
        
        int pri=result+atish;

        return pri;
    }
}