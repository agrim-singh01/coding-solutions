class Solution {
public long countValidSubstrings(String s) {
int n = s.length();
long totalCount = 0;
int latestInvalidStart = -1;
for (int i = 0; i < n; i++) {

if (i >= 2 && s.charAt(i - 2) == 'a' && s.charAt(i - 1) == 'b' && s.charAt(i) == 'c') {
latestInvalidStart = i - 2;
}

totalCount += (i - latestInvalidStart);
}
return totalCount;
}
}