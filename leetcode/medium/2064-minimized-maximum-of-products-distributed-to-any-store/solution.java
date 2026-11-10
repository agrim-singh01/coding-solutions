class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int left = 1;
        int right = 0;
        for(int i=0;i<quantities.length;i++){
            if(right<quantities[i]){
                right = quantities[i];
            }
        }
        int result = right;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            long thr = 0;
            for(int i=0;i<quantities.length;i++){
               thr+=(long)(quantities[i]+mid-1)/mid;
            }
            if(thr <= n){
                 right=mid-1;
                result = mid;
            }else{
               left=mid+1;
            }
        }
        return result;
    }
}