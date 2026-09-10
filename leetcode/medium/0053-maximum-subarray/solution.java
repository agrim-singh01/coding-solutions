class Solution {
    public int maxSubArray(int[] nums) {
        int current = nums[0];
        int max = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i] + current > nums[i]){
                current = current + nums[i];
            }else{
                current = nums[i];
            }
            if(max < current){
                max = current;
            }
        }
        return max;
    }
}