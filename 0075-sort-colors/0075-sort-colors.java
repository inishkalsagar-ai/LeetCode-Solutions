class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
             for(int i=0;i<n-1;i++){
                int minI=i;
                for(int j=i+1;j<n;j++){
                    if(nums[j]<nums[minI]){
                        minI=j;
                    }
                }
                int t = nums[i];
                nums[i] = nums[minI];
                nums[minI]=t;
             }
       
        }
    }
