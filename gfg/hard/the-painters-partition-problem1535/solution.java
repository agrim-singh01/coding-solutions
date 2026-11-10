class Solution {
    public int minTime(int[] arr, int k) {
       int left = 0;
       int right = 0;
       for(int i=0;i<arr.length;i++){
           if(left<arr[i]){
               left=arr[i];
           } 
           right+=arr[i];
       }
       while(left<right){
           int mid = left+(right-left)/2;
           int curr=0;
           int painter = 1;
           for(int i=0;i<arr.length;i++){
               if(curr+arr[i] > mid){
                   painter++;
                   curr=0;
               }
               curr+=arr[i];
           }
           if(painter<=k){
               right=mid;
           }else{
               left=mid+1;
           }
       }
       return right;
        
    }
}
