# Scoping Functions
When to use them, and how to use them. 


## With - Function


**"With" definition**

```
inline fun <T, R> with(receiver: T, block: T.() -> R): R {
    return receiver.block()
}
```

**Usage**

```
class Person {
    var name: String? = null
    var age: Int? = null
}

// without the with
val person: Person = getPerson()
print(person.name)
print(person.age)

// with the with function
val person: Person = getPerson()
with(person) {
	print(name)
	print(age)
}

```

## Apply - Function

* Not accessing any functions of reciever, and want to return the same reciever
* **Often when initializing a new object**

```
// with apply
val peter = Person().apply {
    // only access properties in apply block!
    name = "Peter"
    age = 18
}

// without apply
val clark = Person()
clark.name = "Clark"
clark.age = 18
```

## Also - Function
* block does not access reciever parameters (not mutate parameters)
* **Validating Data before assigning it to property**

```
// with also
class Book(author: Person) {
    val author = author.also {
      requireNotNull(it.age)
      print(it.name)
    }
}

// without also
class Book(val author: Person) {
    init {
      requireNotNull(author.age)
      print(author.name)
    }
}
```

## Let - Function
* execute code if a give value is not null
* convert a nullable object to another nullable object
* limit the scope of a single local variable


```
// using let function
getNullablePerson()?.let {
    // only executed when not-null
    promote(it)
}

// "it" is referring to the nullablePerson
val driversLicence: Licence? = getNullablePerson()?.let {
    // convert nullable person to nullable driversLicence
    licenceService.getDriversLicence(it) 
}

val person: Person = getPerson()
getPersonDao().let { dao -> 
    // scope of dao variable is limited to this block
    dao.insert(person)
}

// not using let function
val person: Person? = getPromotablePerson()
if (person != null) {
  promote(person)
}

// "it" is referring to the nullablePerson
val driver: Person? = getDriver()
val driversLicence: Licence? = if (driver == null) null else
    licenceService.getDriversLicence(it)
    
val person: Person = getPerson()
val personDao: PersonDao = getPersonDao()
personDao.insert(person)
```

## Run - Function
* You need to compute some value or want to limit the scope of multipl local variables

```
// using run
val inserted: Boolean = run {
    val person: Person = getPerson()
    val personDao: PersonDao = getPersonDao()
    personDao.insert(person)
}

fun printAge(person: Person) = person.run {
    print(age)
}

// without
val person: Person = getPerson()
val personDao: PersonDao = getPersonDao()
val inserted: Boolean = personDao.insert(person)
fun printAge(person: Person) = {
    print(person.age)
}
```



