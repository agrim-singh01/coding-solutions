class Solution {
    public List<Integer> exitPoint(int[][] mat) {
      List<Integer> ans = new ArrayList<>();
      int i = 0;
      int j = 0;
      int direction = 0;
      
      int prevrow = 0;
      int prevcol = 0;
      
      while(i>=0 && i < mat.length && j >=0 && j < mat[0].length){
          prevrow = i;
          prevcol = j;
          
          if(mat[i][j] == 1){
              direction =(direction+1)%4;
              mat[i][j] = 0;
          }
          if(direction == 0){
              j++;
          }else if(direction == 1){
              i++;
          }else if(direction == 2){
              j--;
          }else{
              i--;
          }
      }
      ans.add(prevrow);
      ans.add(prevcol);
      
      return ans;
      
        
    }
}