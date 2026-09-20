class Solution {
    public int reverseDegree(String s) {
        int value=0,sum=0;
        for(int i=0;i<s.length();i++){
           char ch =  s.charAt(i);
           if(ch>='a'&&ch<='z'){
             value = 26 - (ch - 'a');
              sum+=value;
           }
          
        }
        // for(int i=0;i<s.length();i++){
        //     sum+=value;
        // }
        return sum;
    }
}