class Solution {
    public int maxDistance(int[] position, int m) {
         Arrays.sort(position);
         int left = 1;
         int right = position[position.length - 1] - position[0];

         int ans = 0;
         while(left<=right){
            int mid = left+(right-left)/2;

            int last = position[0];
            int ball = 1;
            for(int i=0;i<position.length;i++){
                if(position[i] - last >= mid){
                    ball++;
                    last = position[i];
                }
            }
            if(ball >= m){
                left = mid+1;
                ans=mid;
            }else{
                right=mid-1;
            }
         }
         return ans;
    }
}