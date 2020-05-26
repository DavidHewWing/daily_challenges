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

## Notes
- If we see that there is a repeating and we can swap a certain amount of values. We take repeatedValue - windowSize will be the everything not repeated.
- If we want distinct character, we use a map and we can reduce size when entry is 0 and decrement frequency
- NoRepeat we have to get the latest index, which will become start if we see it again, or if start is ahead of the last seen it will be start