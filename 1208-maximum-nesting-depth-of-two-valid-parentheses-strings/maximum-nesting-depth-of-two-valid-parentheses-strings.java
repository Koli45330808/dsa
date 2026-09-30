class Solution {
    public int[] maxDepthAfterSplit(String seq) {

        Stack sc=new Stack();
        char ch[]=seq.toCharArray();

        int temp[]=new int[ch.length];

        for(int i=0;i<ch.length;i++){
                        
            if(ch[i]=='('){
                sc.push(ch[i]);
                temp[i]=sc.size()%2;
            }
            else{
                if(ch[i]==')'){
                    temp[i]=sc.size()%2;
                    sc.pop();
                }
            }


        }


        return temp;
        
    }
}