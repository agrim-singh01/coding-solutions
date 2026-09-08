class Solution {
    public int countWords(String s) {
        int count = 0;
        boolean word = false;
        for(int i=0;i<s.length();i++){
            char letter = s.charAt(i);
            if(letter == ' ' || letter == '\n' || letter == '\t'){
                word = false;
            }else{
            if(word == false){
                word = true;
                count++;
            }
            }
        }
        return count;
    }
}