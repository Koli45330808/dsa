class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        Arrays.sort(letters);
        int n=(int)target;

        for(int i=0;i<letters.length;i++){
            if((int)letters[i]>n){
                return letters[i];
            }
        }

        return letters[0];
        
    }
}