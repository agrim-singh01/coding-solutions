# Check Equal Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two arrays  **a[]**  and  **b[]** of equal size, the task is to find whether the elements in the arrays are equal.
Two arrays are said to be equal if both contain the same set of elements, arrangements (or permutations) of elements may be different though.
 **Note:**  If there are repetitions, then counts of repeated elements must also be the same for two arrays to be equal.

 **Examples:** 

```
Input: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1]
Output: true
Explanation: Both the array can be rearranged to [0,1,2,4,5]

```

```
Input: a[] = [1, 2, 5], b[] = [2, 4, 15]
Output: false
Explanation: a[] and b[] have only one common value.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T01:44:05.396Z  

```java
class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        
        return Arrays.equals(a,b);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1)