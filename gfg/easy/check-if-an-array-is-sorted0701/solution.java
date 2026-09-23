class Solution {
    boolean sorting(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sorting(arr,i+1);
    }
    public boolean isSorted(int[] arr) {
      return  sorting(arr,0);
        
    }
}