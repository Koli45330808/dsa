class Solution {
    public int maxNumberOfBalloons(String text) {

      char ch[]=text.toCharArray();
      Arrays.sort(ch);
      int a=0;
      int b=0;
      int c=0;
      int d=0;
      int e=0;
      ArrayList<Integer> ss=new ArrayList<>();


      for(int i=0;i<ch.length;i++){
        if(ch[i]=='b'){
            a++;

        }
        else{
            if(ch[i]=='a'){
                b++;
            }
            else{
                if(ch[i]=='l'){
                    c++;
                }
                else{
                    if(ch[i]=='o'){
                        d++;

                    }
                    else{
                        if(ch[i]=='n'){
                            e++;
                        }

                    }
                }
            }
        }
      }
      int n=d/2;
      int m=c/2;

      ss.add(a);
      ss.add(b);
      ss.add(m);
      ss.add(n);
      ss.add(e);

      Collections.sort(ss);
      int ask=ss.get(0);


      return ask;
      


        
    }
}