class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> sc=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                sc.add("FizzBuzz");
            }
            else{
                if(i%3==0){
                    sc.add("Fizz");

                }
                else{
                    if(i%5==0){
                        sc.add("Buzz");
                    }
                    else{
                        String ask=Integer.toString(i);
                        sc.add(ask);
                    }
                }
            }
        }
        return sc;
    }
}