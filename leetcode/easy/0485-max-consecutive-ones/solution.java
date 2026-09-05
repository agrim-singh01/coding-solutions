class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int mc = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                c++;
            }else{
                c = 0;
            }
            if(mc < c){
                mc = c;
            }
        }
        return mc;
    }
}