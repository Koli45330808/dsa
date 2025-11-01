class Solution {
    public int lengthOfLastWord(String s) {
         s = s.trim();
        char ch[]=s.toCharArray();
        int count=0;

        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]==' '){
                break;
            }
            else{
                count=count+1;
            }
        }

        return count;
        
    }
}