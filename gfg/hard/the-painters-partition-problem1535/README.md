# Painter's Partition Problem

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an array  **arr[]**  where each element denotes the length of a board, and an integer  **k**  representing the number of painters available.

- Each painter takes 1 unit of time to paint 1 unit length of a board.
- Each painter can paint only a contiguous sequence of boards (no skipping or splitting allowed).

Find the minimum amount of time required to paint all the boards.

 **Examples:** 

```
Input: arr[] = [5, 10, 30, 20, 15], k = 3
Output: 35
Explanation: The optimal allocation of boards among 3 painters is - 
Painter 1 -> [5, 10] → time = 15
Painter 2 -> [30] → time = 30
Painter 3 -> [20, 15] → time = 35
Job will be done when all painters finish i.e. at time = max(15, 30, 35) = 35
```

```
Input: arr[] = [10, 20, 30, 40], k = 2
Output: 60
Explanation: A valid optimal partition is - 
Painter 1 -> [10, 20, 30] → time = 60
Painter 2 -> [40] → time = 40
Job will be complete at time = max(60, 40) = 60
```

```
Input: arr[] = [100, 200, 300, 400], k = 1
Output: 1000
Explanation: There is only one painter, so the painter must paint all boards sequentially. The total time taken will be the sum of all board lengths, i.e., 100 + 200 + 300 + 400 = 1000.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-10T23:12:06.784Z  

```java
class Solution {
    public int minTime(int[] arr, int k) {
       int left = 0;
       int right = 0;
       for(int i=0;i<arr.length;i++){
           if(left<arr[i]){
               left=arr[i];
           } 
           right+=arr[i];
       }
       while(left<right){
           int mid = left+(right-left)/2;
           int curr=0;
           int painter = 1;
           for(int i=0;i<arr.length;i++){
               if(curr+arr[i] > mid){
                   painter++;
                   curr=0;
               }
               curr+=arr[i];
           }
           if(painter<=k){
               right=mid;
           }else{
               left=mid+1;
           }
       }
       return right;
        
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-painters-partition-problem1535/1)