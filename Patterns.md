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

### Pattern: Topological Sort
* Step 1: Initialize Graph
* Step 2: Build Graph
* Step 3: Find Source Verticies
* Step 4: Breadth first search and add to queue when there becomes a new source.
* If there is a valid Top sort then the size of result will be same at prerequisites

```
  HashMap<Integer, Integer> degrees = new HashMap<>();
  HashMap<Integer, List<Integer>> graph = new HashMap<>();
  
  // Step 1: Init Graph
  for (int i = 1; i < numTasks; i++){
    degrees.put(i, 0);
    graph.put(i, new ArrayList<>());
  }
  
  // Step 2: Build Graph
  for (int[] edge : edgeList) {
    int parent = edge[0];
    int child = edge[1];
    degrees.put(child, degrees.get(child));
    graph.get(parent).add(child);
  }
  
  // Step 3: Find Source Verticies and make them start of BFS
  Queue<Integer> queue = new LinkedList<>();
  for (int key : degrees.keySet()) {
    if (degrees.get(key) == 0)
      queue.add(key);
  }
  
  // Step 4: Run BFS
  List<Integer> result = new ArrayList<>();
  while (!queue.isEmpty()) {
    int current = queue.poll();
    result.add(current);
    List<Integer> temp = graph.get(current);
    for (int child : temp) {
      degrees.put(child, degrees.put(child) - 1));
      if (degrees.get(child) == 0)
        queue.offer(child);
    }
  // Return;
  return result;
  }
```

