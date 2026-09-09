class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] size = new boolean[26];
        for(int i= 0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            int character = ch - 'a';
            size[character] = true;
        }
        for(int i=0;i<26;i++){
            if(size[i] == false){
return false;
            }
        }
        return true;
    }
}