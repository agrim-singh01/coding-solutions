# Square Root

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a positive integer  **n,**  find the square root of n. If n is not a perfect square, then return the floor value.

Floor value of any number is the greatest Integer which is less than or equal to that number.

 **Examples:** 

```
Input: n = 4
Output: 2
Explanation: Since, 4 is a perfect square, so its square root is 2.

```

```
Input: n = 11
Output: 3
Explanation: Since, 11 is not a perfect square, floor of square root of 11 is 3.
```

```
Input: n = 1
Output: 1
Explanation: 1 is a perfect square, so its square root is 1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-10T22:37:13.760Z  

```java
class Solution {
    int floorSqrt(int n) {
        int left = 1;
        int right = n;
        
        while(left<=right){
            int mid = left+(right-left)/2;
            int ans = mid*mid;
            if(ans == n){
                return mid;
            }else if(ans<n){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return right;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/square-root/1)