# Trapping Rain Water

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.

 

Original
Java
 **Example 1:** 

```
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

```

 **Example 2:** 

```
Input: height = [4,2,0,3,2,5]
Output: 9

```

 

 **Constraints:** 

- n == height.length
- 1 <= n <= 2 * 104
- 0 <= height[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 75.52%)  
**Memory:** 46.9 MB (beats 96.95%)  
**Submitted:** 2026-11-17T14:34:57.121Z  

```java
class Solution {
    public int trap(int[] height) {
       int left = 0,right=height.length-1,leftmax=0,rightmax=0,totalwater=0;
       while(left<right)
       {
        if(height[left]<height[right]){
        if(height[left]>=leftmax){
            leftmax=height[left];
        }else{
            totalwater+=leftmax-height[left];
        }
        left++;
        }else{
            if(height[right]>=rightmax){
                rightmax=height[right];
            }else{
                totalwater+=rightmax-height[right];
            }
            right--;
        }
       }
       return totalwater; 
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/trapping-rain-water/)