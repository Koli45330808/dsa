class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> ss=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
            ss.add(nums[i]);
            }
        }
        
        
        for(int j=0;j<nums.length;j++){
            if(nums[j]==pivot){
                ss.add(nums[j]);
            }
        }

          for(int j=0;j<nums.length;j++){
            if(nums[j]>pivot){
                ss.add(nums[j]);
            }
        }

         int temp[]=new int[ss.size()];
        for(int k=0;k<ss.size();k++){
            temp[k]=ss.get(k);
        }
        
        return temp;
    }
}