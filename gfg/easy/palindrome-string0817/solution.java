class Solution {
    boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
         sb.reverse();
         String ans = sb.toString();

         return ans.equals(s);


    }
}