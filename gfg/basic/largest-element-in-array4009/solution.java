class Solution {
   static int large(int arr[],int i){
        if(i == arr.length-1){
            return arr[i];
        }
     int right = large(arr,i+1);
       
       return Math.max(arr[i],right);
    }
    public static int largest(int[] arr) {
return large(arr,0);

    }
}
