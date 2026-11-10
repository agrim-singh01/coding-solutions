class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long left = 1;
        int minbus = Integer.MAX_VALUE;
        for(int i=0;i<time.length;i++){
            if(minbus>time[i]){
                minbus = time[i];
            }
        }
        long right = (long)minbus*totalTrips;
        while(left<right){
            long mid=left+(right-left)/2;
            long currtrip = 0;
            for(int i=0;i<time.length;i++){
                currtrip+=mid/time[i];
            }
            if(currtrip >= totalTrips){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return right;
    }
}