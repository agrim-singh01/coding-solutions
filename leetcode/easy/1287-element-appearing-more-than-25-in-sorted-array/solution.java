class Solution {
    public int findSpecialInteger(int[] arr) {
        double max = (0.25*arr.length);
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]== arr[j]){
                    count++;
                }
            }
            if(count>max){
                return arr[i];
            }
        }
        return -1;
    }
}
    