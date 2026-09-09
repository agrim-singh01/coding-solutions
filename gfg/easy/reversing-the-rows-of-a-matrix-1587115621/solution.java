class Solution {
    void interchangeRows(int[][] mat) {
        int n = mat.length;
        int left = 0;
        int right = n - 1;
        
        while(left<right){
            int[] temp = mat[left];
            mat[left] = mat[right];
            mat[right] = temp;
        left++;
        right--;
        }
        
    }
}