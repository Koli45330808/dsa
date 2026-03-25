class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> sc=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            char ch[]=words[i].toCharArray();
            for(int j=0;j<ch.length;j++){
                if(ch[j]==x){
                    sc.add(i);
                    break;
                }
            }
        }
        

        return sc;
    }
}