class Solution {
    public int sumCounts(List<Integer> nums) {
        
    int temp[]=new int[nums.size()];


        for(int i=0;i<nums.size();i++){
            temp[i]=nums.get(i);
    
        }
        int sum=0;

        
        for(int i=0;i<temp.length;i++){
            
            
            for(int j=i;j<temp.length;j++){
               HashSet<Integer> sc=new HashSet<>();
                
                for(int k=i;k<=j;k++){
                    sc.add(temp[k]);


                }
                 int m=sc.size();
                sum=sum+m*m;
                

            
            }
        }

        

        return sum;
        
    }
}