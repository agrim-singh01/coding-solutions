class Solution {
    int floorSqrt(int n) {
        int left = 1;
        int right = n;
        
        while(left<=right){
            int mid = left+(right-left)/2;
            int ans = mid*mid;
            if(ans == n){
                return mid;
            }else if(ans<n){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return right;
        
    }
}