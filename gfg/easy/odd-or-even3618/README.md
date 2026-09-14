# Odd or Even

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a positive integer  **n**, determine whether it is odd or even. Return  **true** if the number is even and  **false** if the number is odd.

 **Examples:** 

```
Input: n = 15
Output: false
Explanation: The number is not divisible by 2, Odd number.
```

```
Input: n = 44
Output: true
Explanation: The number is divisible by 2, Even number.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T09:29:42.921Z  

```java
class Solution {
    static boolean isEven(int n) {
        return n%2==0;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/odd-or-even3618/1)