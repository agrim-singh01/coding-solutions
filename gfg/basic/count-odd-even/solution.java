class Solution {
    public int[] countOddEven(int[] arr) {
        int count=0,counting=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                counting++;
            }else{
                count++;
            }
        }
        return new int[] {count,counting};
        
    }
}