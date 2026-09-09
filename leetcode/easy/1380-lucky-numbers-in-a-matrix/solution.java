class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> rowMin = new ArrayList<>();
        List<Integer> colMax = new ArrayList<>();

        //rowMin
        for(int i=0;i<matrix.length;i++){
            int min = matrix[i][0];
            for(int j=0;j<matrix[i].length;j++){
                if(min > matrix[i][j]){
                    min = matrix[i][j];
                }
            }
            rowMin.add(min);
        }
        //colMax
        for(int j = 0;j<matrix[0].length;j++){
            int max = matrix[0][j];
            for(int i=0;i<matrix.length;i++){
                if(max<matrix[i][j]){
                    max = matrix[i][j];
                }
            }
            colMax.add(max);
        }
        for(int i=0;i<rowMin.size();i++){
            if(colMax.contains(rowMin.get(i))){
                ans.add(rowMin.get(i));
            }
        }
        return ans;
    }
}