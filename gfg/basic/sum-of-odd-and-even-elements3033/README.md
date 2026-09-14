# Sum of odd and even elements

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer **n**, Return an array containing the sum of  **odd** numbers and  **even** numbers from 1 to n, where the first number is the sum of odd numbers and the second number is the sum of even numbers.

 **Examples:** 

```
Input: n = 5
Output: 9 6
Explanation: Odd numbers upto 5 are 1, 3, 5 and their sum = 1 + 3 + 5 = 9.Even numbers upto 5 are 2 and 4 and their sum = 2 + 4 = 6.

```

```
Input: n = 6
Output: 9 12
Explanation: Odd numbers upto 6 are 1, 3, 5 and their sum = 1 + 3 + 5 = 9.Even numbers upto 5 are 2, 4 and 6 and their  sum = 2 + 4 + 6  = 12.

```

 **Constraints:** 
1 <= n <= 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T09:34:14.996Z  

```java
class Solution {
    public int[] findSum(int n) {
        int sum1=0,sum2=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                sum1+=i;
            }else{
                sum2+=i;
            }
        }
        return new int[] {sum2,sum1};
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-odd-and-even-elements3033/1)