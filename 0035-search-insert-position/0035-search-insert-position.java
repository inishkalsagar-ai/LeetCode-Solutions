class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k] < target){
                s++;
            }
        }
        return s;
    }
}