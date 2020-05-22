# Sliding Window
- Use when calculating something on a subarray

## Example
We know that what we want is a contiguous subarray, and usually a sum/product of some sort.

So we take a window and subtract from everything leaving, and add the incoming element to the window.

```
Find largest subarray of size 3.

[1,2,3,4,5], k = 3

1st Window - [1,2,3]
Sum = 6
[|1,2,3|,4,5]

1st Window - [2,3,4]
We subtract thing going out which is 1.
Add incoming to window
Sum = 6 - 1
= 5 + 4 = 9
[|1,2,3|,4,5]

So on, and so forth...

```