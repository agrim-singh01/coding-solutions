# Count Occurrences in Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a sorted array  **arr[]** and a number  **target**, find the number of occurrences of target in given array. 

 **Examples:** 

```
Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
Output: 4
Explanation: target = 2 occurs 4 times in the given array so the output is 4.
```

```
Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 4
Output: 0
Explanation: target = 4 is not present in the given array so the output is 0.

```

```
Input: arr[] = [8, 9, 10, 12, 12, 12], target = 12
Output: 3
Explanation: target = 12 occurs 3 times in the given array so the output is 3.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-10T22:31:21.428Z  

```java
class Solution {
    int countFreq(int[] arr, int target) {
       int first = -1;
       int last = -1;
       
       int left = 0;
       int right = arr.length-1;
       
       while(left<=right){
           int mid= left+(right-left)/2;
           if(arr[mid] == target){
               first = mid;
               right = mid -1;
           }else if(arr[mid]<target){
               left=mid+1;
           }else{
               right=mid-1;
           }
       }
       if (first == -1) {
            return 0;
            }
        left = 0;
        right = arr.length-1;
       
       while(left<=right){
           int mid= left+(right-left)/2;
           if(arr[mid] == target){
               last = mid;
               left=mid+1;
           }else if(arr[mid]<target){
               left=mid+1;
           }else{
               right=mid-1;
           }
       }
       int result = last - first+1;
       return result;
        
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1)