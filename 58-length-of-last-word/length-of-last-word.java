class Solution {
    public int lengthOfLastWord(String s) {
         s = s.trim();
         //char ch[]=s.toCharArray();
          String ch[]=s.split("\\s+");
        int count=0;
        for(int j=ch.length-1;j>=0;j--){
            char ch2[]=ch[j].toCharArray();

        for(int i=0;i<=ch2.length-1;i++){
            
            
                count=count+1;
        
        }
        break;
        }

        return count;
        
    }
}