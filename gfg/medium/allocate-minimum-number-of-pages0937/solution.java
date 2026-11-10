class Solution {
    public int findPages(int[] arr, int k) {
        long left = 0;
        long right=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>left){
                left=arr[i];
            }
            right+=arr[i];
        }
        if(arr.length<k) return -1;
        
        while(left<right){
            long mid = left+(right-left)/2;
            
            int curr = 0;
            int book = 1;
            
            for(int i=0;i<arr.length;i++){
                if(curr+arr[i] > mid){
                    book++;
                    curr=0;
                }
                curr+=arr[i];
            }
            if(book<=k){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return (int)left;
        
    }
}