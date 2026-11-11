class Solution {
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int left = 1;
        int right = arr[arr.length - 1]-arr[0];
        int ans = 0;
        while(left<=right){
            int mid=left+(right-left)/2;
            int cows = 1;
            int first = arr[0];
            
            for(int i=0;i<arr.length;i++){
                if(arr[i] - first >= mid){
                    cows++;
                    first=arr[i];
                }
            }
            if(cows>=k){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
}