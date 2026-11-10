class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if(dist.length-1>=hour){
            return -1;
        }
        int left=1;
        int right = 10000000;
int result= right;
        while(left<=right)
        {
            int mid = left+(right-left)/2;

            double thr = 0;
            for(int i=0;i<dist.length-1;i++){
                thr+=(dist[i]+mid-1)/mid;
            }
            thr+=(double)dist[dist.length - 1]/mid;

            if(thr <= hour){
                right=mid-1;
                result = mid;
            }else{
                left=mid+1;
            }
        }
        return result;
    }
}