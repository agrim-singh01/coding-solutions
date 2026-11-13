# Reverse String II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` and an integer `k`, reverse the first `k` characters for every `2k` characters counting from the start of the string.

If there are fewer than `k` characters left, reverse all of them. If there are less than `2k` but greater than or equal to `k` characters, then reverse the first `k` characters and leave the other as original.

 

Original
Java
 **Example 1:** 

```
Input: s = "abcdefg", k = 2
Output: "bacdfeg"

```

 **Example 2:** 

```
Input: s = "abcd", k = 2
Output: "bacd"

```

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of only lowercase English letters.
- 1 <= k <= 104

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 98.43%)  
**Memory:** 44.6 MB (beats 63.09%)  
**Submitted:** 2026-11-13T21:08:42.888Z  

```java
class Solution {
    public String reverseStr(String s, int k) {

        int step = k * 2;
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i += step){

            int start = i;
            int end = Math.min(i + k - 1, arr.length - 1);

            while(start < end){

                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        return new String(arr);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string-ii/)