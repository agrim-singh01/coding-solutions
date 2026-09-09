class Solution {
    public String toggleCase(String s) {
      StringBuilder ans = new StringBuilder();
      
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                ans.append(Character.toUpperCase(ch));
            }else{
                ans.append(Character.toLowerCase(ch));
            }
        }
        return ans.toString();
    }
}
