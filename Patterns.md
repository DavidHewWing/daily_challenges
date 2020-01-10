### Pattern 1: Sliding Window
* Use when you need to keep a contiguous subarray or substring
* Always keep a reference to the start of the window
* Best way to solve is to visualize the window
* You also have to identify if the window size is always going to be the same (fixed) or you have to shrink/expand it

### Pattern 2: Two Pointers
* Usually deals with sorted arrays
* 2Sum and other mathimatical questions
* Approach by putting hi pointer and lo pointer

### Pattern 3: Slow-fast Pointers
* Usually deals with linked lists
* When you have to detect a cycle.
* Often solution is to find the midpoint of the list and modify the first hald and second half.
* `while (fast.next != null && fast != null) {slow = slow.next; fast = fast.next.next}` (find the midpoint)

### Pattern 4: Interval
* Two intervals (A, B) or overlapping / intersecting / are of interest if: Ay >= Bx
* Example: A = [1,5], B = [0, 2]
* Here: **Ax <= By or By >= Ax** so (1 <= 2 or 2 >= 1). Therefore they are overlapping.

