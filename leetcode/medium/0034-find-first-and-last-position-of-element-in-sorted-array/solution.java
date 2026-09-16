class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {firstoccur(nums,target),lastoccur(nums,target)};
    }
    private int firstoccur(int[] arr,int target){
int low=0;
int high = arr.length - 1;
int ans=-1;
while(low<=high){
    int mid = low+(high-low)/2;
    if(arr[mid] == target){
        ans = mid;
        high = mid - 1;
    }else if(arr[mid]>target){
        high = mid-1;
    }else{
        low=mid+1;
    }
     mid=low+(high-low)/2;
}
return ans;
    }
    private int lastoccur(int[] arr,int target){
int low=0;
int high = arr.length - 1;
int ans=-1;
while(low<=high){
    int mid = low+(high-low)/2;
    if(arr[mid] == target){
        ans = mid;
        low = mid + 1;
    }else if(arr[mid]>target){
        high = mid-1;
    }else{
        low=mid+1;
    }
     mid=low+(high-low)/2;
}
return ans;
    }
}