# Convert Sentence to Camel Case

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a sentence  **`s`**, your task is to remove all spaces and convert it to  **Camel Case**. In Camel Case, words are joined without spaces, the first word keeps its original case, and each subsequent word starts with an uppercase letter.

 **Note:**  It is guaranteed that the sample test cases don't contain leading spaces.

 **Examples:** 

```
Input: s = "i got intern at geeksforgeeks"
Output: "iGotInternAtGeeksforgeeks"
Explanation: All spaces are removed and each word starts with a capital letter, except the first word which retains its original capitalization.
```

```
Input: s = "here comes the garden"
Output: "hereComesTheGarden"
Explanation: Spaces are removed and each word after the first is capitalized.
```

```
Input: s = "coding is fun"
Output: "codingIsFun"
Explanation: Spaces are removed, the first word retains its original case, and each subsequent word starts with a capital letter.
```

**Constraints:
**1 <= s.size() <= 106

The string  **s** contains only lowercase english alphabets and spaces.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T20:44:47.845Z  

```java
class Solution {
    String toCamelCase(String s){
        StringBuilder ans = new StringBuilder();
        boolean upper = false;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                upper = true;
            }else if(upper == true){
                ans.append(Character.toUpperCase(ch));
                upper = false;
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
   
    public String convertToCamelCase(String s) {
        return toCamelCase(s);
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/convert-sentence-to-camel-case/1)