class Solution {
    public int countWords(String s) {
        boolean isFound = false;
        int count = 0;
        for(int i = 0;i<s.length();i++){
            char letter = s.charAt(i);
            if(letter ==  ' ' || letter == '\n' || letter == '\t'){
                isFound = false;
            }else{
                if(isFound == false){
                    isFound=true;
                    count++;
                }
            }
        }
        return count;
        
    }
}