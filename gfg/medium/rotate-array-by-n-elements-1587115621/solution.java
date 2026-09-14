class Solution {
    public void rotateArr(int arr[], int d) {
        int n = arr.length;
        if(arr == null || arr.length == 0){
            return;
        }
        
         d = d % n;
         
         
          reverse(arr,0,d-1);
          reverse(arr,d,n-1);
          reverse(arr,0,n-1);
        
        
    }
    private void reverse(int[] nums,int start,int end){
        while(start<end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
        }
    }
}