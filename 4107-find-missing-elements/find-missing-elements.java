class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        Arrays.sort(nums);
        ArrayList<Integer> ss=new ArrayList<>();
        int n=nums[nums.length-1];
        int m=nums[0];

        for(int i=m;i<=n;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    count++;
                }
            }
            if(count==0){
                ss.add(i);
            }
        }

        return ss;
        
    }
}