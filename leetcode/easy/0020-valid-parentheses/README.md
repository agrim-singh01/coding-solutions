# Valid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

 

 **Example 1:** 

 **Input:**  s = "()"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "()[]{}"

 **Output:**  true

 **Example 3:** 

 **Input:**  s = "(]"

 **Output:**  false

 **Example 4:** 

 **Input:**  s = "([])"

 **Output:**  true

 **Example 5:** 

 **Input:**  s = "([)]"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of parentheses only '()[]{}'.

## Solution

**Language:** Java  
**Runtime:** 129 ms (beats 12.61%)  
**Memory:** 46.9 MB (beats 5.44%)  
**Submitted:** 2026-10-07T15:19:21.213Z  

```java
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

```

---

[View on LeetCode](https://leetcode.com/problems/valid-parentheses/)