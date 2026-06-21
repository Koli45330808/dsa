class Solution {
    public int hammingWeight(int n) {
        int count=0;
        String str=Integer.toBinaryString(n);
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1'){
                count++;
            }
        }

        return count;
        
    }
}