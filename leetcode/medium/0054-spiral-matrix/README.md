# Spiral Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an `m x n` `matrix`, return  *all elements of the*  `matrix`  *in spiral order*.

 

 **Example 1:** 

```
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

```

 **Example 2:** 

```
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

```

 

 **Constraints:** 

- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 10
- -100 <= matrix[i][j] <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.9 MB (beats 62.54%)  
**Submitted:** 2026-09-26T02:21:49.187Z  

```java
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length-1;
        ArrayList<Integer> ans=new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++){
                ans.add(matrix[top][j]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
             if(top<=bottom){
                for(int j=right;j>=left;j--){
                    ans.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
                
            }
           
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/spiral-matrix/)