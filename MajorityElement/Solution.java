class Solution {
    public int majorityElement(int[] nums) {
        int count =0 ;
        int can =0;
        for( int i:nums){
            if(count==0){
                can=i;
            }
            count += (i==can) ? 1: -1;
        }
        return can;
    }
}