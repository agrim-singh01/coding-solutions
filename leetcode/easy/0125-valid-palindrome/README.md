# Valid Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A phrase is a  **palindrome**  if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` *if it is a  **palindrome**, or* `false` *otherwise*.

 

Original
Java
 **Example 1:** 

```
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

```

 **Example 2:** 

```
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

```

 **Example 3:** 

```
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

```

 

 **Constraints:** 

- 1 <= s.length <= 2 * 105
- s consists only of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 69.41%)  
**Memory:** 43.7 MB (beats 90.23%)  
**Submitted:** 2026-11-12T18:54:35.195Z  

```java
class Solution {
    public boolean isPalindrome(String s) {
       int  left = 0;
       int right  = s.length()-1;
       while(left<right){
        char l = s.charAt(left);
       char r = s.charAt(right);
        if(!Character.isLetterOrDigit(l)){
            left++;
        }else if(!Character.isLetterOrDigit(r)){
            right--;
        }else{
if(Character.toLowerCase(l) != Character.toLowerCase(r)){
    return false;
}
 left++;
        right--;
        }
       
       }
       return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-palindrome/)