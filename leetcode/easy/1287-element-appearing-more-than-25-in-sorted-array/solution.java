class Solution {
    public int findSpecialInteger(int[] arr) {
        int target = arr.length/4;
        int curr = 1;
        if(curr>target){
            return arr[0];
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                curr++;
            }else{
                curr = 1;
            }
            if(curr>target){
                return arr[i];
            }
        }
        return -1;
    }
}