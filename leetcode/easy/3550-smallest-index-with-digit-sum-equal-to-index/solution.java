class Solution {
    public int smallestIndex(int[] nums) {
      
      for(int i=0;i<nums.length;i++){
        int dsum = 0;
        int n = nums[i];
        while(n>0){
            int digit = n % 10;
            dsum+=digit;
            n = n/10;
        }
        if(dsum == i){
            return i;
        }
      }  
      return -1;
    }
}