class Solution {
    public boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        char ch[]=str.toCharArray();
        String str2="";
        for(int i=ch.length-1;i>=0;i--){
            str2+=ch[i];

        }

        if(str2.equals(str)){
            return true;
        }
        else{
            return false;
        }
        
    }
}