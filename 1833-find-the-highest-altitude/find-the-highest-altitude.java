class Solution {
    public int largestAltitude(int[] gain) {



        ArrayList<Integer> sc=new ArrayList<>();


        int ask=0;
    
        int n=gain.length;
        sc.add(ask);
        int i=0;

        while(n>0){
            ask=ask+gain[i];
            sc.add(ask);
            i++;
            n--;

        }

        int temp[]=new int[sc.size()];

        for(int j=0;j<sc.size();j++){

              temp[j]=sc.get(j);
        }

          int result=0;
        for(int k=0;k<temp.length;k++){
            result=Math.max(result,temp[k]);
        }


        return result;

        
        
    }
}