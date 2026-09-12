# K-diff Pairs in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` and an integer `k`, return  *the number of  **unique**  k-diff pairs in the array*.

A  **k-diff**  pair is an integer pair `(nums[i], nums[j])`, where the following are true:

- 0 <= i, j < nums.length
- i != j
- |nums[i] - nums[j]| == k

 **Notice**  that `|val|` denotes the absolute value of `val`.

 

 **Example 1:** 

```
Input: nums = [3,1,4,1,5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.

```

 **Example 2:** 

```
Input: nums = [1,2,3,4,5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).

```

 **Example 3:** 

```
Input: nums = [1,3,1,5,4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -107 <= nums[i] <= 107
- 0 <= k <= 107

## Solution

**Language:** Java  
**Runtime:** 10 ms (beats 90.47%)  
**Memory:** 46.3 MB (beats 77.60%)  
**Submitted:** 2026-09-12T03:27:39.724Z  

```java
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        int count = 0;
if(k<0) return 0;
        while(right < nums.length){
            if(left == right){
                right++;
                continue;
            }
            int diff = nums[right] - nums[left];
            if(diff > k){
left++;
            }else if(diff < k){
                right++;
            }else{
                count++;

                int prevLeft = nums[left];
                int prevRight = nums[right];

                while(left<nums.length && nums[left] == prevLeft){
                    left++;
                }
                while(right<nums.length && nums[right] == prevRight){
                    right++;
                }
            }
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/k-diff-pairs-in-an-array/)