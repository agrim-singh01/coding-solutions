class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int left = Integer.MAX_VALUE;
        int right = 0;
        if((long)m*k > bloomDay.length) return -1;
        for(int i=0;i<bloomDay.length;i++){
            if(left>bloomDay[i]){
                left=bloomDay[i];
            }
            if(right<bloomDay[i]){
                right=bloomDay[i];
            }
        }
        while(left<right){
            int mid = left + (right-left)/2;

            int boq=0,currflower=0;

            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=mid){
                    currflower++;
                    
                    if(currflower >= k){
                        boq++;
                        currflower=0;
                    }
                }else{
                    currflower=0;
                }
            }
            if(boq>=m){
                 right=mid;
            }else{
                left=mid+1;
               
            }
        }
        return right;
    }
}