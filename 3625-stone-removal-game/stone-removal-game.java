class Solution {
    public boolean canAliceWin(int n) {
        if(n<10 ){
            return false;
        }

        ArrayList<Integer> sc=new ArrayList<>();
        int j=10;

       
        while(n>=0){

            n=n-j;
            if(n<0){
                int a=Math.abs(n);
                sc.add(n);
             break ;
            }
            sc.add(j);
            j--;


            
            



        }
        int b=10;
        int k=0;

        for(int i=0;i<sc.size();i++){
            if(b!=sc.get(i)){
                break;
            }
            else{
                k++;
            }
            b--;


        }

       
           if(k%2==1){
               return true;
           }

           return false;
        
    }
}