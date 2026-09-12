class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length-1;
        int count = 0;

        while(left<right){
           // if(k<0) return 0;
            if(left == right){
                right++;
                continue;
            }
            int diff = nums[right] + nums[left];
            if(diff > k){
                right--;
            }else if(diff < k){
left++;       
     }else{
                count++;
                left++;
                right--;
               
            }
        }
        return count;
    }
}