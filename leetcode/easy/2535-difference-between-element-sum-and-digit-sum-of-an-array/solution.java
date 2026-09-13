class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitSum = 0;
        for(int i=0;i<nums.length;i++){
            int digit =0;
            sum+=nums[i];
        int n = nums[i];
        while(n>0){
             digitSum += n % 10;
            n = n/10;
            
        }
//digitSum+=digit;
        }
        return Math.abs(sum-digitSum);
    }
}