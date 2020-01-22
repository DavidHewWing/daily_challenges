# Kotlin Resource File

## Basic Syntax

### Functions
```
fun sum(a: Int, b: Int): Int {
    return a + b
}
```
SAME
```
fun sum(a: Int, b: Int) = a + b
```
Return Type VOID
```
fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}
```

### Variables
* **Read only** -> `val: Type`
* **Reassignable** -> `var: Type`

### String templates
* `val s1 = "a is $a"`

### Conditional Expression
* Same as java but can also be used in place of the ternary operator
* `fun maxOf(a: Int, b: Int) = if (a > b) a else b`

### Type checks and automatic casts
* The **is** operator checks if an expression is an instance of a type. 
* We don't need cast to explicit type if we check type with **is**
* Notice the **obj: Any**
```
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }

    // `obj` is still of type `Any` outside of the type-checked branch
    return null
}
```

### For Loops
```
val items = listOf("apple", "banana", "kiwifruit")
for (item in items) {
    println(item)
}
```

```
val items = listOf("apple", "banana", "kiwifruit")
for (index in items.indices) {
    println("item at $index is ${items[index]}")
}
```

### While Loops - Same as Java

### When Expression
* Kind of like Switch -> Case in Java
```
fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }
```

### Ranges
* Output: 12345
```
for (x in 1..5) {
    print(x)
}
```
