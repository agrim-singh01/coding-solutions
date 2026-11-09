class Solution {
    public void rotate(int[] arr) {
//int first = arr[0];
int last = arr[arr.length-1];
// for(int i=1;i<arr.length;i++){
//     arr[i-1]=arr[i];
   
// }
//  arr[arr.length-1] = first;
for(int i=arr.length-1;i>0;i--){
    arr[i] = arr[i-1];
}
      arr[0]=last;  
    }
}