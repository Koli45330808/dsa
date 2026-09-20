class Solution {
    public int reverseDegree(String s) {

        char ch[]=s.toCharArray();
        int a=27;
         int res=0;

        for(char  i='a';i<='z';i++){

              a--;
            for(int j=0;j<ch.length;j++ ){
                if(ch[j]==i){
                    res=res+a*(j+1);
                    
                }
            }


        }

        return res;
        
    }
}