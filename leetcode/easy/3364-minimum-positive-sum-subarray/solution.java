class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<=n-1;i++){
            int sum = 0;
            for(int j=i;j<=n-1;j++){
                sum+=nums.get(j);
                int length=j-i+1;
                if(length > r) break;
                if(length >= l && sum > 0){
                    if(sum<minSum){
                        minSum=sum;
                    }
                }
    
            }
        }
        if(minSum == Integer.MAX_VALUE){
            return -1;
        }
        return minSum;
    }
}