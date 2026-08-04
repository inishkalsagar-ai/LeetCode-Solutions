class Solution {
    public int rob(int[] nums) {
        int d2=0;
        int d1=0;
        for(int n:nums){
           int k = Math.max(d1,d2+n);
           d2 = d1;
           d1=k;
        }
        return d1;
    }
}