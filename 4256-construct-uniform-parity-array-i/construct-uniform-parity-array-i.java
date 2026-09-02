class Solution {
    public boolean uniformArray(int[] nums1) {

        int n=nums1.length;

        HashSet<Integer> sc=new HashSet<>();

        

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    sc.add(Math.abs(nums1[i]-nums1[j]));
                }
            }
        }

        int sum=0;
        int count=0;

     for(int j:sc){ 
        if(j%2==0){
            sum++;
        }
        if(j%2!=0){
            count++;
        }


     }

     if(sum==sc.size() || count==sc.size()){
        return true;
     }
    return true;
    
      }
}