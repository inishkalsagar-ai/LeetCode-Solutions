class Solution {
    public int mySqrt(int x) {
        int s = x/2;
        if(x==0||x==1){
            return x;
        }
        int l=1;
        while((long)l*l<=x){
            l++;
        }
    return l-1;
}
}