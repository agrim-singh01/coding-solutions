# Minimum Positive Sum Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums` and  **two**  integers `l` and `r`. Your task is to find the  **minimum**  sum of a  **subarray**  whose size is between `l` and `r` (inclusive) and whose sum is greater than 0.

Return the  **minimum**  sum of such a subarray. If no such subarray exists, return -1.

A  **subarray**  is a contiguous  **non-empty**  sequence of elements within an array.

 

Original
Java
 **Example 1:** 

 **Input:**  nums = [3, -2, 1, 4], l = 2, r = 3

 **Output:**  1

 **Explanation:** 

The subarrays of length between `l = 2` and `r = 3` where the sum is greater than 0 are:

- [3, -2] with a sum of 1
- [1, 4] with a sum of 5
- [3, -2, 1] with a sum of 2
- [-2, 1, 4] with a sum of 3

Out of these, the subarray `[3, -2]` has a sum of 1, which is the smallest positive sum. Hence, the answer is 1.

 **Example 2:** 

 **Input:**  nums = [-2, 2, -3, 1], l = 2, r = 3

 **Output:**  -1

 **Explanation:** 

There is no subarray of length between `l` and `r` that has a sum greater than 0. So, the answer is -1.

 **Example 3:** 

 **Input:**  nums = [1, 2, 3, 4], l = 2, r = 4

 **Output:**  3

 **Explanation:** 

The subarray `[1, 2]` has a length of 2 and the minimum sum greater than 0. So, the answer is 3.

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 1 <= l <= r <= nums.length
- -1000 <= nums[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 53.06%)  
**Memory:** 45.8 MB (beats 79.80%)  
**Submitted:** 2026-11-14T18:26:26.627Z  

```java
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<=n-1;i++){
            int sum = 0;
            for(int j=i;j<=n-1;j++){
                sum+=nums.get(j);
                int length=j-i+1;
                if(length > r) break;
                if(length >= l && sum > 0){
                    if(sum<minSum){
                        minSum=sum;
                    }
                }
    
            }
        }
        if(minSum == Integer.MAX_VALUE){
            return -1;
        }
        return minSum;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-positive-sum-subarray/)