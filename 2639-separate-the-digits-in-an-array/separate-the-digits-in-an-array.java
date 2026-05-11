class Solution {
    public int[] separateDigits(int[] nums) {


         ArrayList<Integer> ss=new ArrayList<>();
		
		for(int i= nums.length-1;i>=0;i--) {
			int n= nums[i];
			int rem=0;
			 //ArrayList<Integer> sc=new ArrayList<>();
			while(n!=0){
				rem=n%10;
				ss.add(rem);
				n=n/10;
				
				
				
				
				
			}
			
			
		}
		Collections.reverse(ss);
        int temp[]=new int[ss.size()];

        for(int i=0;i<ss.size();i++){
            temp[i]=ss.get(i);
        }
        
        return temp;
    }
}