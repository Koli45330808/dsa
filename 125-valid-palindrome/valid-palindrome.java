class Solution {
    public boolean isPalindrome(String s) {
       // StringBuilder sc=new StringBuilder();
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
        String ask=cleaned .toLowerCase();
        String reversed = new StringBuilder(ask).reverse().toString();
        //char ch[]=ask.toCharArray();
        //String ass;
        //for(int i=ch.length-1;i>0;i++){
          //  ass+=ch[i];

        
        //}

        if(ask.equals(reversed)){
            return true;
        }
        else{
            return false;
        }



        
    }
}