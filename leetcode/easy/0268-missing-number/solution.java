class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int getSum = n*(n+1)/2;
        int orgSum = 0;
        for(int i=0;i<nums.length;i++){
            orgSum += nums[i];
        }
        return getSum - orgSum;
    }
}