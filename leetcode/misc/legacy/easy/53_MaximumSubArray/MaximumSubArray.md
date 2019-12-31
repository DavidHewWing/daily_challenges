#53. Maximum Sub Array

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

**Example:**

```
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
```

Explanation: [4,-1,2,1] has the largest sum = 6.

## Explanation

Okay this one was a little tricky for an easy question. Basically when you get a sum that is less than 0, you can forget about that being the max sub array. 

Otherwise we add it to the sum, and check if the sum is greater than the current max.
