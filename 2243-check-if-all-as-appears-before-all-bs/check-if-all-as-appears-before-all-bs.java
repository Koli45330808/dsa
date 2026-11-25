class Solution {
    public boolean checkString(String s) {
        

        char ch[]=s.toCharArray();


       int g=0;

    for(int i=0;i<ch.length-1;i++){

        if(ch[i]=='b' && ch[i+1]=='a'){
            g++;
        }

    }

     if(g>0){
        return false;
     }

     return true;

    }
}