# Search Insert Position

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.

 

Original
Java
 **Example 1:** 

```
Input: nums = [1,3,5,6], target = 5
Output: 2

```

 **Example 2:** 

```
Input: nums = [1,3,5,6], target = 2
Output: 1

```

 **Example 3:** 

```
Input: nums = [1,3,5,6], target = 7
Output: 4

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -104 <= nums[i] <= 104
- nums contains distinct values sorted in ascending order.
- -104 <= target <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 44.1 MB (beats 88.07%)  
**Submitted:** 2026-11-11T05:02:57.973Z  

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int right = nums.length-1;

        while(low<=right){
            int mid = low + (right-low)/2;
if(nums[mid]==target){
    return mid;
}
            if(nums[mid]<target){
                low=mid+1;
            }else{
                right=mid-1;
            }
        }
        return low;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/search-insert-position/)