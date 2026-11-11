class Solution {
    public int findPages(int[] arr, int k) {
      if(k > arr.length) return -1;
      long left = Integer.MIN_VALUE;
      long right = 0;
      for(int i=0;i<arr.length;i++){
          if(left<arr[i]){
              left=arr[i];
          }
          right = right + arr[i];
      }
      
      while(left<right)
      {
        long mid = left+(right-left)/2;
        int curr = 0;
        int student = 1;
        
        for(int i=0;i<arr.length;i++){
            if(curr+arr[i]>mid){
                student++;
                curr=0;
            }
            curr+=arr[i];
        }
        if(student > k){
            left=mid+1;
        }else{
            right=mid;
        }
        
      }
      return (int)right;
        
    }
}