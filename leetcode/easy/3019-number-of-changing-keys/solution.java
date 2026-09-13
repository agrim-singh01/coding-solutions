class Solution {
    public int countKeyChanges(String s) {
        boolean upper = true;
       int count = 0;
        for(int i=1;i<s.length();i++){
char ch = s.charAt(i);
char prevch = s.charAt(i-1);
if(Character.toLowerCase(ch) != Character.toLowerCase(prevch)){
    count++;
}
        }
        return count;
    }
}