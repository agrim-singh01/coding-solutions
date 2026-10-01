class Solution {
    public boolean isValid(String s) {
        int prevLength = -1;
        
        // Loop runs as long as the string length keeps shrinking
        while (s.length() != prevLength) {
            prevLength = s.length();
            s = s.replace("()", "")
                 .replace("[]", "")
                 .replace("{}", "");
        }
        
        // If the final string is empty, it means all parentheses matched perfectly
        return s.isEmpty();
    }
}
