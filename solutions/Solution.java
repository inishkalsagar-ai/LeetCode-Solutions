class Solution {
    public int findNumbers(int[] nums) {
    int count=0;
        for(int i:nums){
            if(even(i)){
                count++;
            }
        }
        return count;
    }
boolean even(int i){
      int EvenDig = digits(i);
      return EvenDig % 2 == 0;
    }
 int digits(int i){
            if(i < 0){
                i = i * -1;
            }
            if(i ==0){
                return 0;
            }
            int count=0;
            while (i > 0) {
                count++;
                i = i/10;
            }
            return count;
        }   
}
    