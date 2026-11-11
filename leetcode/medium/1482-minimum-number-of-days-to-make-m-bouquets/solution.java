class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length) return -1;
          int left = 1;
          int right = Integer.MIN_VALUE;

          for(int i=0;i<bloomDay.length;i++){
            if(right<bloomDay[i]){
                right=bloomDay[i];
            }
          }
          while(left<right){
            int mid = left + (right-left)/2;
            int flower = 0;
            int boq = 0;
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=mid){
                    flower++;
                    if(flower == k){
                        boq++;
                        flower = 0;
                    }
                }else{
                    flower = 0;
                }
            }
            if(boq<m){
                left=mid+1;
            }else{
                right=mid;
            }
          }
          return right;
    }
}