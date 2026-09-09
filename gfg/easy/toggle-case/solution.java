class Solution {
    public String toggleCase(String s) {
       StringBuilder ans = new StringBuilder();
       for(int i = 0;i<s.length();i++){
           char ch = s.charAt(i);
           if(Character.isUpperCase(ch)){
               ans.append(Character.toLowerCase(ch));
           }else{
               ans.append(Character.toUpperCase(ch));
           }
       }
       return ans.toString();
        
    }
}
