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
       while(left<right){
        int weigh = left+(right-left)/2;
        int currload = 0;
        int day = 1;
        for(int i=0;i<weights.length;i++){
            if(currload + weights[i] > weigh){
                day++;
                 currload=0;
            }
           
            currload+=weights[i];
        }
        if(day > days){
            left=weigh+1;
        }else{
            right=weigh;
        }
       } 
       return right;
    }
}