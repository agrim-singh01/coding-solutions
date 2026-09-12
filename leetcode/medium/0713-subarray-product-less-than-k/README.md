# Subarray Product Less Than K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array of integers `nums` and an integer `k`.

Return the number of contiguous subarrays where the  **product**  of all the elements in the  **subarray**  is  **strictly less**  than `k`.

 

 **Example 1:** 

```
Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.

```

 **Example 2:** 

```
Input: nums = [1,2,3], k = 0
Output: 0

```

 

 **Constraints:** 

- 1 <= nums.length <= 3 * 104
- 1 <= nums[i] <= 1000
- 0 <= k <= 106

## Solution

**Language:** Java  
**Runtime:** 2 ms  
**Memory:** 42.5 MB  
**Submitted:** 2026-09-12T04:05:40.862Z  

```java
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        while(left<right){
            int prod = nums[left]*nums[right];
            if(prod < k){
count++;
left++;
            }if(k<prod){
                return 0;
            }


        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/subarray-product-less-than-k/)