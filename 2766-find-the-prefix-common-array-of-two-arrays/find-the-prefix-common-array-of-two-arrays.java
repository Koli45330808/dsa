class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int n=A.length-1;

        
        ArrayList<Integer> ss=new ArrayList<>();
        int i=0;
        int j=0;
        int m=A.length-1;

        while(i<=n && j<=n){
           ArrayList<Integer> sc=new ArrayList<>();


             
             for(int k=0;k<=n-m;k++){
                sc.add(A[k]);


             }
             i++;
             int count=0;
             for(int l=0;l<=n-m;l++){
                if(sc.contains(B[l])){
                    count++;
                }
             }
             j++;
             ss.add(count);
             m--;

             sc.clear();

        }

        int temp[]=new int[ss.size()];

        for(int k=0;k<ss.size();k++){
            temp[k]=ss.get(k);
        }

        return temp;
        
    }
}