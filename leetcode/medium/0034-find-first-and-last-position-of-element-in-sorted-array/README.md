# Find First and Last Position of Element in Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value.

If `target` is not found in the array, return `[-1, -1]`.

You must write an algorithm with `O(log n)` runtime complexity.

 

 **Example 1:** 

```
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

```

 **Example 2:** 

```
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

```

 **Example 3:** 

```
Input: nums = [], target = 0
Output: [-1,-1]

```

 

 **Constraints:** 

- 0 <= nums.length <= 105
- -109 <= nums[i] <= 109
- nums is a non-decreasing array.
- -109 <= target <= 109

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 48 MB (beats 71.56%)  
**Submitted:** 2026-09-16T17:22:27.847Z  

```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {firstoccur(nums,target),lastoccur(nums,target)};
    }
    private int firstoccur(int[] arr,int target){
int low=0;
int high = arr.length - 1;
int ans=-1;
while(low<=high){
    int mid = low+(high-low)/2;
    if(arr[mid] == target){
        ans = mid;
        high = mid - 1;
    }else if(arr[mid]>target){
        high = mid-1;
    }else{
        low=mid+1;
    }
     mid=low+(high-low)/2;
}
return ans;
    }
    private int lastoccur(int[] arr,int target){
int low=0;
int high = arr.length - 1;
int ans=-1;
while(low<=high){
    int mid = low+(high-low)/2;
    if(arr[mid] == target){
        ans = mid;
        low = mid + 1;
    }else if(arr[mid]>target){
        high = mid-1;
    }else{
        low=mid+1;
    }
     mid=low+(high-low)/2;
}
return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)