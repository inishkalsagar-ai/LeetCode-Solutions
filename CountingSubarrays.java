public class Solutions {
    
}
class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int off = n+1;
        int[] bit = new int[2 * n + 2];
        long vSubarrayCount = 0;
        int prefix = 0;

        add(bit, prefix + off, 1);

        for(int num : nums){
            if(num == target){
                prefix += 1;
            } else{
                prefix -= 1;
            }

            vSubarrayCount += query(bit, prefix + off -1);

            add(bit,prefix + off, 1);
        }
        return vSubarrayCount;
    }

    private void add(int[] bit,int index,int val){
        for(; index < bit.length; index += index & (-index)){
            bit[index] += val;
        }
    }
    private int query(int[] bit,int index){
        int sum = 0;
        for(; index >0;index -= index & (-index)){
            sum+=bit[index];
        }
        return sum;
    }
}