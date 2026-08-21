class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int st =0;
        int end = letters.length-1;

        while(st<=end){
            int m = st +(end-st)/2;
            if(target < letters[m]){
                end = m-1;
            }
            else{
                st = m+1;
            }
        
        }
        return letters[st % letters.length];
    }
}