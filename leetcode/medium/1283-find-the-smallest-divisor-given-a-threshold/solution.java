class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>right){
                right=nums[i];
            }
        }
        while(left<right){
            int mid = left+(right-left)/2;
            long thres = 0;
            for(int i=0;i<nums.length;i++){
                thres+=(nums[i]+mid-1)/mid;
            }
            if(thres<=threshold){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return right;
    }
}