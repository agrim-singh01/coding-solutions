class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int i=0;i<piles.length;i++){
            if(right<piles[i]){
                right = piles[i];
            }
        }
        while(left<right)
        {
            int mid = left+(right-left)/2;
            int thr = 0;
            for(int i=0;i<piles.length;i++){
                thr+=(piles[i]+mid-1)/mid;
            }
            if(thr>h){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return right;
    }
}