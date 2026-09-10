# Move All Zeroes to End

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array  **arr[]**  of non-negative integers. You have to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. The operation must be performed  **in place**, meaning you should not use extra space for another array.

 **Examples:** 

```
Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.

```

```
Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
Explanation: No change in array as there are no 0s.

```

```
Input: arr[] = [0, 0]
Output: [0, 0]
Explanation: No change in array as there are all 0s.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T02:46:59.385Z  

```java
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int k = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[k] = arr[i];
                k++;
            }
        }
        while(k <arr.length){
            arr[k] = 0;
            k++;
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1)