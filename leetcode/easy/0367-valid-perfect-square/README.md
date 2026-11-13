# Valid Perfect Square

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a positive integer num, return `true`  *if*  `num`  *is a perfect square or*  `false`  *otherwise*.

A  **perfect square**  is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as `sqrt`.

 

Original
Java
 **Example 1:** 

```
Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

```

 **Example 2:** 

```
Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.

```

 

 **Constraints:** 

- 1 <= num <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 40.4 MB  
**Submitted:** 2026-11-13T21:19:07.068Z  

```java
class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1;
        int r = num;

        while(l<=r){
            int mid=l+(r-l)/2;
            long sqr =(long) mid*mid;
            if(num == sqr){
                return true;
            }else if(num<sqr){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-perfect-square/)