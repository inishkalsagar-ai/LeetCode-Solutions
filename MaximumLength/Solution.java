class Solution {
    public int maximumLength(int[] nums) {
        Map<Long,Integer> count=new HashMap<>();
        for(int num : nums){
            long v=(long) num;
            count.put(v,count.getOrDefault(v,0)+1);
        }
        int mL=1;

        if(count.containsKey(1L)){
            int one=count.get(1L);
            if(one%2==0){
                one--;
            }
            mL=Math.max(mL,one);
        }
        for(long num:count.keySet()){
            if(num==1L) continue;
            long cu=num;
            int cL=0;
            while(count.containsKey(cu)){
                int fr=count.get(cu);
                if(fr>=2){
                    cL+=2;
                    cu=cu*cu;
                }
                else{
                    cL+=1;
                    break;
                }
            }

            if(!count.containsKey(cu)){
                cL-=1;
            }
            mL=Math.max(mL,cL);
        }
        return mL;
    }
}