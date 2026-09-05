class Solution {
    public int shipWithinDays(int[] weight, int days) {
         int low=0;
        int high=0;

        int sum=0;
        int max=weight[0];
        for(int i=0;i<weight.length;i++){
            if(weight[i]>max){
                max=weight[i];
            }
            sum+=weight[i];
        }
        low=max;
        high=sum;
        
        while(low<high){
            int mid=(low+high)/2;
            int parts=1;
            int currentsum=0;

            for(int i=0;i<weight.length;i++){
                if(currentsum+weight[i]>mid){
                    parts++;
                    currentsum=weight[i];
                }
                else{
                    currentsum+=weight[i];
                }
            }
            if(parts>days){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
}