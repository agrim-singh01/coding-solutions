class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //Arrays.sort(piles);
        int low = 1;
        int n = piles.length -1;
        int max = Integer.MIN_VALUE;
       // int ans = -1;
        for(int i=0;i<=n;i++){
        if(max<piles[i]){
    max = piles[i];
}
        }     
        int high = max;
        while(low<high){
            int mid = low+(high-low)/2;
            int time=0;
            for(int i=0;i<piles.length;i++){
                time+=(piles[i]+mid-1)/mid;
            }
            if(time>h){
               low=mid+1;
            }else{
               high = mid;
            }
            // mid = low+(high-low)/2;
        
        }
        return low;
        
    }
}