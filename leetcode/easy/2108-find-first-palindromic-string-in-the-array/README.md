# Find First Palindromic String in the Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of strings `words`, return  *the first  **palindromic**  string in the array*. If there is no such string, return  *an  **empty string*** `""`.

A string is  **palindromic**  if it reads the same forward and backward.

 

 **Example 1:** 

```
Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"
Explanation: The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.

```

 **Example 2:** 

```
Input: words = ["notapalindrome","racecar"]
Output: "racecar"
Explanation: The first and only string that is palindromic is "racecar".

```

 **Example 3:** 

```
Input: words = ["def","ghi"]
Output: ""
Explanation: There are no palindromic strings, so the empty string is returned.

```

 

 **Constraints:** 

- 1 <= words.length <= 100
- 1 <= words[i].length <= 100
- words[i] consists only of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 27.33%)  
**Memory:** 47.6 MB (beats 48.06%)  
**Submitted:** 2026-09-13T13:57:22.608Z  

```java
class Solution {
    public String firstPalindrome(String[] words) {
     for(int i=0;i<words.length;i++){
         StringBuilder sb = new StringBuilder(words[i]);
         sb.reverse();
         String palin = sb.toString();
         if(words[i].equals(palin)){
            return words[i];
         }
     } 
     return "";
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-first-palindromic-string-in-the-array/)