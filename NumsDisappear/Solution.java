class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ros = new ArrayList<>();
         for(int num:nums){
            int s = Math.abs(num)-1;

            if(nums[s] > 0){
                nums[s] = - nums[s];
            }
         }
         for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                ros.add(i+1);
            }
         }
         return ros;
    }
}