class Solution {
    public int totalNumbers(int[] digits) {


           int cnt=0;
           HashSet<Integer> sc=new HashSet<>();

        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){

                    int str=digits[i]*100+digits[j]*10+digits[k];

                    if(digits[i]==0 ){
                        continue;
                    }
                     else{
                        if(str%2==0 && i!=j &&j!=k && i!=k ){
                        sc.add(str);
                        
                    }
                     }



                }
            }
        }


        for(int s:sc){
            cnt++;
        }

        return cnt;
        
    }
}