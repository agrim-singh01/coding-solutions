# Element Appearing More Than 25% In Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array  **sorted**  in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.

 

 **Example 1:** 

```
Input: arr = [1,2,2,6,6,6,6,7,10]
Output: 6

```

 **Example 2:** 

```
Input: arr = [1,1]
Output: 1

```

 

 **Constraints:** 

- 1 <= arr.length <= 104
- 0 <= arr[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 45.4 MB (beats 99.12%)  
**Submitted:** 2026-11-08T07:19:58.400Z  

```java
class Solution {
    public int findSpecialInteger(int[] arr) {
        int target = arr.length/4;
        for(int i=0;i<arr.length-target;i++){
            if(arr[i] == arr[i+target]){
                return arr[i];
            }
        }
        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/)