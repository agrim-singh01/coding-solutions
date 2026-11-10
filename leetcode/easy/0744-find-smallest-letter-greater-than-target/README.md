# Find Smallest Letter Greater Than Target

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array of characters `letters` that is sorted in  **non-decreasing order**, and a character `target`. There are  **at least two different**  characters in `letters`.

Return  *the smallest character in* `letters` *that is lexicographically greater than* `target`. If such a character does not exist, return the first character in `letters`.

 

Original
Java
 **Example 1:** 

```
Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

```

 **Example 2:** 

```
Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.

```

 **Example 3:** 

```
Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].

```

 

 **Constraints:** 

- 2 <= letters.length <= 104
- letters[i] is a lowercase English letter.
- letters is sorted in non-decreasing order.
- letters contains at least two different characters.
- target is a lowercase English letter.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 46 MB (beats 74.82%)  
**Submitted:** 2026-11-10T22:08:08.943Z  

```java
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length-1;

        int ans=-1;
        
        while(left<=right)
        {
            int mid = left + (right-left)/2;
            if(letters[mid]>target){
                right = mid -1;
                ans = mid;
            }else{
                left=mid+1;
            }
        }
        if(ans == -1){
            return letters[0];
        }else{
           return letters[ans];
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)