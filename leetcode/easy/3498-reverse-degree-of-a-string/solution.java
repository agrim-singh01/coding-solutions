class Solution {
    public int reverseDegree(String s) {
        long sum=0;
        for(int i=0;i<s.length();i++){
           char ch =  s.charAt(i);
           if(ch>='a'&&ch<='z'){
             sum += 26 - (ch - 'a');
             
           }
          
        }
        return (int)sum;
    }
}