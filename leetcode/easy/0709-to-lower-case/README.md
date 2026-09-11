# To Lower Case

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, return  *the string after replacing every uppercase letter with the same lowercase letter*.

 

 **Example 1:** 

```
Input: s = "Hello"
Output: "hello"

```

 **Example 2:** 

```
Input: s = "here"
Output: "here"

```

 **Example 3:** 

```
Input: s = "LOVELY"
Output: "lovely"

```

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.9 MB (beats 51.50%)  
**Submitted:** 2026-09-11T04:15:15.324Z  

```java
class Solution {
    public String toLowerCase(String s) {
    //    StringBuilder sb = new StringBuilder();
    //    for(int i=0;i<s.length();i++){
    //     char ch = s.charAt(i);
    //     if(Character.isUpperCase(ch)){
    //         sb.append(Character.toLowerCase(ch));
    //     }else{
    //         sb.append(ch);
    //     }
    //    }
    //    return sb.toString();
    String str = s.toLowerCase();
    return str;
           }
}
```

---

[View on LeetCode](https://leetcode.com/problems/to-lower-case/)