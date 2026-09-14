class Solution {
    public int[] findSum(int n) {
        int sum1=0,sum2=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                sum1+=i;
            }else{
                sum2+=i;
            }
        }
        return new int[] {sum2,sum1};
        
    }
}