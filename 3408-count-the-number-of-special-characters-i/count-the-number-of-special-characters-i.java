class Solution {
    public int numberOfSpecialChars(String word) {

        HashSet<Character> sc=new HashSet<>();
        for(int i=0;i<word.length();i++){
            sc.add(word.charAt(i));
        }

        Iterator<Character> set=sc.iterator();

        

        String str="";

        while(set.hasNext()){
                str=str+set.next();
        }


        char ch[]=str.toCharArray();
        int count=0;

         for(int i=0;i<ch.length-1;i++){
            if(Character.toUpperCase(ch[i])==ch[i+1]||Character.toUpperCase(ch[i+1])==ch[i]){
                count++;
            }
         }

     return count;

        
    }
}