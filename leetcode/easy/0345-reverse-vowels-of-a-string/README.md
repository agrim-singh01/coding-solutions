# Reverse Vowels of a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, reverse only all the vowels in the string and return it.

The vowels are `'a'`, `'e'`, `'i'`, `'o'`, and `'u'`, and they can appear in both lower and upper cases, more than once.

 

Original
Java
 **Example 1:** 

 **Input:**  s = "IceCreAm"

 **Output:**  "AceCreIm"

 **Explanation:** 

The vowels in `s` are `['I', 'e', 'e', 'A']`. On reversing the vowels, s becomes `"AceCreIm"`.

 **Example 2:** 

 **Input:**  s = "leetcode"

 **Output:**  "leotcede"

 

 **Constraints:** 

- 1 <= s.length <= 3 * 105
- s consist of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 42.44%)  
**Memory:** 45.9 MB (beats 92.23%)  
**Submitted:** 2026-11-13T20:37:38.355Z  

```java
class Solution {
    public String reverseVowels(String s) {
        char arr[] = new char[s.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.charAt(i);
        }
        int left = 0;
        int right = arr.length-1;
        String vowel = "AEIOUaeiou";

        while(left<right){
            while(left<right && vowel.indexOf(arr[left]) == -1){
                left++;
            }
            while(left<right && vowel.indexOf(arr[right]) == -1){
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;;
        }
        return new String(arr);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-vowels-of-a-string/)