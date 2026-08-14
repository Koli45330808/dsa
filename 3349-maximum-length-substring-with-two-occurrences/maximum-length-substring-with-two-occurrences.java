class Solution {
    public int maximumLengthSubstring(String s) {


        char ch[]=s.toCharArray();

        int ask=0;
        for(int i=0;i<ch.length-1;i++){
            for(int j=i;j<ch.length;j++){
               char[] temp = Arrays.copyOfRange(ch, i, j + 1);
                
                boolean as=true;
                int len = j-i+1;

                Arrays.sort(temp);
    
                
                for(int k=0;k<temp.length-2;k++){

                
                    if(temp[k]==temp[k+2]){
                        as=false;

                    }
                    
                     
                     


                }

                if(as){
                    ask=Math.max(ask,len);
                }



               
            }
        }


        return ask;
        
    }
}