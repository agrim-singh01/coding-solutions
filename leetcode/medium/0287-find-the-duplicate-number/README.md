# Find the Duplicate Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is only  **one repeated number**  in `nums`, return  *this repeated number*.

You must solve the problem  **without**  modifying the array `nums` and using only constant extra space.

 

Original
Java
 **Example 1:** 

```
Input: nums = [1,3,4,2,2]
Output: 2

```

 **Example 2:** 

```
Input: nums = [3,1,3,4,2]
Output: 3

```

 **Example 3:** 

```
Input: nums = [3,3,3,3,3]
Output: 3
```

 

 **Constraints:** 

- 1 <= n <= 105
- nums.length == n + 1
- 1 <= nums[i] <= n
- All the integers in nums appear only once except for precisely one integer which appears two or more times.

 

 **Follow up:** 

- How can we prove that at least one duplicate number must exist in nums?
- Can you solve the problem in linear runtime complexity?

## Solution

**Language:** Java  
**Runtime:** 23 ms (beats 21.81%)  
**Memory:** 82.2 MB (beats 84.00%)  
**Submitted:** 2026-11-10T18:58:53.854Z  

```java
class Solution {
    public int findDuplicate(int[] nums) {
        int left = 1;
        int right = nums.length-1;

        while(left<right){
            int mid = left+(right-left)/2;
int count = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=mid){
                    count++;
                }
            }
            if(count > mid){
                right = mid;
            }else{
                left=mid+1;
            }
        }
        return right;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-the-duplicate-number/)