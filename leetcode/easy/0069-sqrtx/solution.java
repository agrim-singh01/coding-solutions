class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ans=0;
        if(x < 2) return x;
        while(left<=right){
            int mid = left + (right-left)/2;
            long num = (long)mid*mid;
            if(num==x){
                return (int)mid;
            }else if(num<x){
                ans=mid;
                left=mid+1;
            }else{
               right=mid-1;
            }
        }
        return (int)ans;
    }
}