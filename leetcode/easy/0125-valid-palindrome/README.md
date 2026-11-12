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
**Memory:** 43.6 MB (beats 96.64%)  
**Submitted:** 2026-11-12T18:35:04.991Z  

```java
class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            char charLeft = s.charAt(left);
            char charRight = s.charAt(right);
            
            // Skip non-alphanumeric characters from the left
            if (!Character.isLetterOrDigit(charLeft)) {
                left++;
            } 
            // Skip non-alphanumeric characters from the right
            else if (!Character.isLetterOrDigit(charRight)) {
                right--;
            } 
            // Compare characters ignoring case
            else {
                if (Character.toLowerCase(charLeft) != Character.toLowerCase(charRight)) {
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