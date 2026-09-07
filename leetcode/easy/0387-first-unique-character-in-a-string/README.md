# First Unique Character in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, find the  **first**  non-repeating character in it and return its index. If it  **does not**  exist, return `-1`.

 

 **Example 1:** 

 **Input:**  s = "leetcode"

 **Output:**  0

 **Explanation:** 

The character `'l'` at index 0 is the first character that does not occur at any other index.

 **Example 2:** 

 **Input:**  s = "loveleetcode"

 **Output:**  2

 **Example 3:** 

 **Input:**  s = "aabb"

 **Output:**  -1

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 57.95%)  
**Memory:** 47.5 MB (beats 6.05%)  
**Submitted:** 2026-09-07T17:19:40.529Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/first-unique-character-in-a-string/)