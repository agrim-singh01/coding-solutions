class Solution {
    public int minTime(int[] arr, int k) {
      int left = Integer.MIN_VALUE;
      int right=0;
      for(int i=0;i<arr.length;i++){
          if(left<arr[i]) {
              left=arr[i];
          }
          right+=arr[i];
      }
      
      while(left<right){
          int mid = left+(right-left)/2;
          
          int curr=0,painter=1;
          for(int i=0;i<arr.length;i++){
              if(curr+arr[i]>mid){
                  painter++;
                  curr=0;
              }
              curr+=arr[i];
          }
          if(painter>k){
              left=mid+1;
          }else{
              right=mid;
          }
      }
      return right;
        
    }
}
