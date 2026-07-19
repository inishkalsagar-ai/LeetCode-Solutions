class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int pri : prices){
           
                if(pri < min){
                    min = pri;
                }
                else{
                    max = Math.max(max,pri-min);
                }
            }
            return max;
        }
    }
 
