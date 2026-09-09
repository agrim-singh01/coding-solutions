class Solution {
    
    public int searchCharacter(String s, char ch) {
      for(int i = 0;i<s.length();i++){
          int curr = s.charAt(i);
          if(curr == ch){
              return i;
          }
      }
      return -1;
        
    }
}