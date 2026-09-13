class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i=0;i<sentences.length;i++){
            int curr = 0;
            String s = sentences[i];
            for(int j=0;j<s.length();j++){
                char ch = s.charAt(j);
                if(ch == ' '){
                    curr++;
                }
            }
            if(max<curr){
                max=curr;
            }
        }//space+1=sentence
        return max+1;
    }
}