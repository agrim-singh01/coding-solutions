class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        int count = 0;
if(k<0) return 0;
        while(right < nums.length){
            if(left == right){
                right++;
                continue;
            }
            int diff = nums[right] - nums[left];
            if(diff > k){
left++;
            }else if(diff < k){
                right++;
            }else{
                count++;

                int prevLeft = nums[left];
                int prevRight = nums[right];

                while(left<nums.length && nums[left] == prevLeft){
                    left++;
                }
                while(right<nums.length && nums[right] == prevRight){
                    right++;
                }
            }
        }
        return count;
    }
}