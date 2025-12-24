class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        int sum=0;


        for(int as:apple){
            sum=sum+as;
        }
        Arrays.sort(capacity);
        int count=0;

        for(int j=capacity.length-1;j>=0;j--){
           // if(sum>=capacity[j]){
            sum=sum-capacity[j];
            count++;
            if(sum<=0){
                break;
            }
            //}
            

        }

        return count;
        
    }
}