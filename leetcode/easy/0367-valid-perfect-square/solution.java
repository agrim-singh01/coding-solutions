class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1;
        int r = num;

        while(l<=r){
            int mid=l+(r-l)/2;
            long sqr =(long) mid*mid;
            if(num == sqr){
                return true;
            }else if(num<sqr){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return false;
    }
}