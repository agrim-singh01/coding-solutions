# Count Words in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  consisting of lowercase English alphabets, spaces, tab characters (\t), and newline characters (\n),  **count**  the total number of  **words**  present in the string. A word is defined as a continuous sequence of lowercase English letters, while spaces, tabs, and newline characters act as separators between words.

 **Examples:** 

```
Input: s = "abc def"
Output: 2
Explanation: There is a space at 4th position which works as a seperator between "abc" and "def".

```

```
Input: s = "a\nyo\t"
Output: 2
Explanation: There are two words in the string: "a" and "yo". The characters \n and \t act as separators, splitting the string into words.
```

 **Constraints:** 
2 <= Length of String <= 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T19:31:12.822Z  

```java
class Solution {
    public int countWords(String s) {
        boolean isFound = false;
        int count = 0;
        for(int i = 0;i<s.length();i++){
            char letter = s.charAt(i);
            if(letter ==  ' ' || letter == '\n' || letter == '\t'){
                isFound = false;
            }else{
                if(isFound == false){
                    isFound=true;
                    count++;
                }
            }
        }
        return count;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-number-of-words1500/1)