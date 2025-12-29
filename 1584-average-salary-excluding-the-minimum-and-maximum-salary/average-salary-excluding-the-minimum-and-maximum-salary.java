class Solution {
    public double average(int[] salary) {

        Arrays.sort(salary);

        int sum=0;
        int k=0;

         for(int i=1;i<salary.length-1;i++){
            sum=sum+salary[i];
            k++;

        }

         //double result=sum/k;
        return (double)sum/(salary.length-2);
        
    }
}