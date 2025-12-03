class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        int rev=0;
        int sum=0;
        while(num!=0){
            sum=num%10;
            rev=rev+sum;
            num=num/10;

        }
     return addDigits(rev);


        
    }
}