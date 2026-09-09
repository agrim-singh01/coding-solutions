class Solution {
    // Function to convert the given string to Camel Case
    String camelCase(String s){
        StringBuilder ans = new StringBuilder();
        boolean makeupper = false;
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ' ' ){
                makeupper = true;
            }else if(makeupper == true){
                ans.append(Character.toUpperCase(ch));
                makeupper=false;
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
        
    }
    public String convertToCamelCase(String s) {
    return camelCase(s); 
    }
}