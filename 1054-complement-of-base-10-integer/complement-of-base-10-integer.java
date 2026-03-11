class Solution {
    public int bitwiseComplement(int n) {


        String binary = Integer.toBinaryString(n);
        char ch[]=binary.toCharArray();
        //int temp[]=new int[ch.length];
        String str="";
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0'){
                str=str+1;

            }
            if(ch[i]=='1'){
                 str=str+0;
            }
        }
        
        
        

        int num = Integer.parseInt(str, 2);

        return num;
    }
}