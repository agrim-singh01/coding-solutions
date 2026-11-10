class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for(int i=0;i<weights.length;i++){
            if(left<weights[i]){
                left = weights[i];
            }
            right+=weights[i];
        }
        int result = right;
        while(left<=right){
            int mid=left+(right-left)/2;
            int currload = 0;
            int day = 1;
            for(int i=0;i<weights.length;i++){
                if(currload + weights[i] > mid){
                    day++;
                    currload=0;
                }
                currload+=weights[i];
            }
            if(day>days){
                left=mid+1;
            }else{
                right=mid-1;
                result = mid;
            }
        }
        return result;
    }
}