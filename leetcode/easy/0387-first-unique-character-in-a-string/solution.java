class Solution {
    public int firstUniqChar(String s) {
        int[] counts = new int[26];
        for(int i=0;i<s.length();i++){
            char letter = s.charAt(i);
            int character = letter - 'a';
            counts[character] = counts[character] + 1;
        }
        for(int i=0;i<s.length();i++){
            char letter =s.charAt(i);
            int character = letter - 'a';
            if(counts[character] == 1){
                return i;
            }else{
                continue;
            }
        }
        return -1;
    }
}