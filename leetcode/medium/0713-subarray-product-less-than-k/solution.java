class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        while(left<right){
            int prod = nums[left]*nums[right];
            if(prod < k){
count++;
left++;
            }if(k<prod){
                return 0;
            }


        }
        return count;
    }
}