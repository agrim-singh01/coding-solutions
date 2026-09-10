class Solution {
    public static boolean isPalindrome(int[] arr) {
        // code here
        int left = 0;
        int right = arr.length-1;
        
        while(left<right){
            if(arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
