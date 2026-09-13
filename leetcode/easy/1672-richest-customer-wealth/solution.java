class Solution {
    public int maximumWealth(int[][] accounts) {
        int max =0;
        for(int i=0;i<accounts.length;i++){
            int currmax = 0;
            for(int j=0;j<accounts[i].length;j++){
                currmax+=accounts[i][j];
            }
            if(currmax >max){
                max = currmax;
            }
        }
        return max;
    }
}