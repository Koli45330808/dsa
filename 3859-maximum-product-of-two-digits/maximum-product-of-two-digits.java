class Solution {
    public int maxProduct(int n) {

        ArrayList<Integer> sc=new ArrayList<>();
        int res=0;

        while(n!=0){
           int rem=n%10;
           sc.add(rem);
           n=n/10;
        }

        int temp[]=new int[sc.size()];
        for(int i=0;i<sc.size();i++){
            temp[i]=sc.get(i);
        }

        Arrays.sort(temp);

        for(int i=0;i<temp.length;i++){
           
            for(int j=0;j<temp.length;j++){
                int ask=0;
                if(i!=j){
                    ask=temp[i]*temp[j];
                }
                 res=Math.max(res,ask);
            }
           
        }

        return res;
        
    }
}