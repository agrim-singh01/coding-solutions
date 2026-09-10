class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] num = new int[nums.length];
        int i = 0;
        int j = n;
        int k = 0;
    while(i<n){
        num[k] = nums[i];
        k++;
        num[k] = nums[j];
        k++;

        i++;
        j++;
    }
    return num;
    }
}