class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for(int i=0;i<piles.length;i++){
            if(high<piles[i]){
                high=piles[i];
            }
        }
        while(low<high){
            int k = low+(high-low)/2;
            long thr=0;
            for(int i=0;i<piles.length;i++){
                // int speed = piles[i]/k;
                // if(piles[i] % k != 0){
                //     speed++;
                // }
                // thr+=speed;
                thr += (long)(piles[i]+k-1)/k;
            }
            if(thr>h){
                low=k+1;
            }else{
                high=k;
            }
        }
        return high;
    }
}