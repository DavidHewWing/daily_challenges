# 14 Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

**Example 1:**

```
Input: ["flower","flow","flight"]
Output: "fl"

```

**Example 2:**

```
Input: ["dog","racecar","car"]
Output: ""
```

Explanation: There is no common prefix among the input strings

**Note:**
All given inputs are in lowercase letters a-z.

## Explanation

Think of each string a row, and each character as a column, so:

```
["flower"]
["flow"]
["flight"]
```
We check the first character with the rest, then the next, and so on. When you get to the same length (the whole first word is the prefix), or one of the characters doesn't match then we return the prefix up to that point.