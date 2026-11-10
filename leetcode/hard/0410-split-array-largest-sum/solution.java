class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;

        for(int i=0;i<nums.length;i++){
            if(left<nums[i]){
                left=nums[i];
            }
            right+=nums[i];
        }
    while(left<right){
        int mid = left + (right-left)/2;
        int currarr = 0;
        int subcount = 1;
        for(int i=0;i<nums.length;i++){
            if(currarr + nums[i] > mid){
                subcount++;
                currarr=0;
            }
            currarr+=nums[i];
        }
        if(subcount > k){
            left=mid+1;
        }else{
            right=mid;
        }
    }
    return right;

    }
}