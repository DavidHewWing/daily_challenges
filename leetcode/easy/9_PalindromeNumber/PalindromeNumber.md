**Palindrome Number**

Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

**Example 1:**

```
Input: 121
Output: true
```

**Example 2:**

```
Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
```

**Example 3:**

```
Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
```

## Explanation

**Brute-force**

The brute force method is to change to string. Then run an algorithm that checks if it a palindrome. To check if it is an palindrome you loop through have the size and keep checking if the front is the same as the back. 

This solution is O(n), but you are wasting space by utilizing creating the ```int i = 0``` and using strings.

**Better / Clever Way **

You get rid of the edge cases: "negative numbers" and if there is a 0 at the end.

You loop through half of the array, using a while loop and `x/=10`, which will knock off the last digit in `x`. You build an integer: `num` that is reverse of `x` (which will be half the length of x). Then you check if the first half is equal to the second half or `x` is equal to `num`.