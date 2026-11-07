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
**Runtime:** 56 ms (beats 7.24%)  
**Memory:** 46.1 MB (beats 75.60%)  
**Submitted:** 2026-11-07T19:19:55.041Z  

```java
class Solution {
    public int findSpecialInteger(int[] arr) {
        double max = (0.25*arr.length);
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]== arr[j]){
                    count++;
                }
            }
            if(count>max){
                return arr[i];
            }
        }
        return -1;
    }
}
    
```

---

[View on LeetCode](https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/)