class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length){
            return -1;
        }
        int left = Integer.MAX_VALUE;
        int right = 0;

        for(int i=0;i<bloomDay.length;i++){
            if(left>bloomDay[i]){
                left=bloomDay[i];
            }
            if(right<bloomDay[i]){
                right=bloomDay[i];
            }
        }
        int result = right;
        while(left<=right){
            int mid = left+(right-left)/2;

            int currflower = 0;
            int boq = 0;
            
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=mid){
                    currflower++;
                    if(currflower == k){
                        boq++;
                        currflower = 0;
                    }
                }else{
                    currflower=0;
                }
            }
            if(boq >= m){
                right=mid-1;
                result = mid;
            }else{
                left=mid+1;
            } 
                   }
                   return result;
         
    }
}