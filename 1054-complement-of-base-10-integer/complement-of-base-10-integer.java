class Solution {
    public int bitwiseComplement(int n) {


        String binary = Integer.toBinaryString(n);
        char ch[]=binary.toCharArray();
        int temp[]=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0'){
                temp[i]=1;

            }
            if(ch[i]=='1'){
                 temp[i]=0;
            }
        }
        
        String str="";
        for(int i=0;i<temp.length;i++){
            str=str+temp[i];
        }

        int num = Integer.parseInt(str, 2);

        return num;
    }
}