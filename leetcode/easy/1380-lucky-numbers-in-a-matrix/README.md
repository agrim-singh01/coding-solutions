# Lucky Numbers in a Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an `m x n` matrix of  **distinct** numbers, return  *all  **lucky numbers**  in the matrix in  **any** order*.

A  **lucky number**  is an element of the matrix such that it is the minimum element in its row and maximum in its column.

 

 **Example 1:** 

```
Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.

```

 **Example 2:** 

```
Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.

```

 **Example 3:** 

```
Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.

```

 

 **Constraints:** 

- m == mat.length
- n == mat[i].length
- 1 <= n, m <= 50
- 1 <= matrix[i][j] <= 105.
- All elements in the matrix are distinct.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 44.31%)  
**Memory:** 47.2 MB (beats 33.46%)  
**Submitted:** 2026-09-09T19:09:52.100Z  

```java
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> rowMin = new ArrayList<>();
        List<Integer> colMax = new ArrayList<>();

        //rowMin
        for(int i=0;i<matrix.length;i++){
            int min = matrix[i][0];
            for(int j=0;j<matrix[i].length;j++){
                if(min > matrix[i][j]){
                    min = matrix[i][j];
                }
            }
            rowMin.add(min);
        }
        //colMax
        for(int j = 0;j<matrix[0].length;j++){
            int max = matrix[0][j];
            for(int i=0;i<matrix.length;i++){
                if(max<matrix[i][j]){
                    max = matrix[i][j];
                }
            }
            colMax.add(max);
        }
        for(int i=0;i<rowMin.size();i++){
            if(colMax.contains(rowMin.get(i))){
                ans.add(rowMin.get(i));
            }
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/lucky-numbers-in-a-matrix/)