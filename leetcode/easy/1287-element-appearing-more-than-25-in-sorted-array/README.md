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
**Runtime:** 1 ms (beats 69.58%)  
**Memory:** 45.7 MB (beats 89.40%)  
**Submitted:** 2026-11-08T07:03:13.678Z  

```java
class Solution {
    public int findSpecialInteger(int[] arr) {
        int target = arr.length/4;
        int curr = 1;
        if(curr>target){
            return arr[0];
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                curr++;
            }else{
                curr = 1;
            }
            if(curr>target){
                return arr[i];
            }
        }
        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/)