# Squares of a Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums` sorted in  **non-decreasing**  order, return  *an array of  **the squares of each number**  sorted in non-decreasing order*.

 

 **Example 1:** 

```
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

```

 **Example 2:** 

```
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -104 <= nums[i] <= 104
- nums is sorted in non-decreasing order.

 

 **Follow up:**  Squaring each element and sorting the new array is very trivial, could you find an `O(n)` solution using a different approach?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 47.3 MB (beats 63.68%)  
**Submitted:** 2026-09-13T07:24:41.580Z  

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int index=n-1;

           

            while(left<=right){
                 int leftsqr = nums[left]*nums[left];
            int rightsqr = nums[right]*nums[right];
                if(leftsqr>rightsqr){
                    result[index] = leftsqr;
                    left++;
                }else{
                    result[index] = rightsqr;
                    right--;
                }
                index--;
            }
         
        
        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/squares-of-a-sorted-array/)