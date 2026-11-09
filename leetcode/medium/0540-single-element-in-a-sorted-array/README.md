# Single Element in a Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return  *the single element that appears only once*.

Your solution must run in `O(log n)` time and `O(1)` space.

 

 **Example 1:** 

```
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2

```

 **Example 2:** 

```
Input: nums = [3,3,7,7,10,11,11]
Output: 10

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 0 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 52.5 MB (beats 79.34%)  
**Submitted:** 2026-11-09T21:03:45.099Z  

```java
class Solution {
    public int singleNonDuplicate(int[] nums) {
       int n = nums.length;
       if( n == 1){
       return nums[0];
       } 
       if(nums[0] != nums[1]){
        return nums[0];
       }
       if(nums[n-1] != nums[n-2]){
        return nums[n-1];
       }
       int left = 1;
       int right = nums.length-2;
       while(left<=right){
        int mid = left+(right-left)/2;
        if(nums[mid] !=nums[mid+1] && nums[mid] != nums[mid-1]){
            return nums[mid];
        }else if(((mid % 2 == 0) && (nums[mid] == nums[mid+1])) || ((mid % 2 != 0) && (nums[mid] == nums[mid-1]))){
            left=mid+1;
        }else{
            right=mid-1;
        }
       }
       return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/single-element-in-a-sorted-array/)