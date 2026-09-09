class Solution {
    String toCamelCase(String s){
        StringBuilder ans = new StringBuilder();
        boolean upper = false;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                upper = true;
            }else if(upper == true){
                ans.append(Character.toUpperCase(ch));
                upper = false;
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
   
    public String convertToCamelCase(String s) {
        return toCamelCase(s);
        
    }
}