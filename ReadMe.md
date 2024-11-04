# U7S3 - Constructors

* Part A - Foundations 7.3
* Part B - Foundations Practice
* Part C - Algorithm Challenge

## Part A

### Exercise 01

#### Step 01

In the package `partA` look at the file `Player` 

#### Step 02
* Investigate what happens when fields are accessed
before they’re assigned values
  * Instantiate a Player
  * Try printing the value of each field

Your program is working correctly, if when run, the following is the output:

```
null
0.0
0
```

#### Step 03
* Can fields be set more efficiently?
  * Add a setFields() method to the `PlayerTest` class
  * This method should take three arguments, which are used to
  set the values for every field
  * Replace code in the main method with calls to this method

#### Step 04
* Continue editing with the `PlayerTest` class
* Copy the constructor into the `Player` class
  * Run the program
  * Observe how the code in this method is executed when Player objects are instantiated

```
//Constructor
public Player(){
System.out.println("This is a constructor");
}//end constructor

```
#### Step 05
* Modify the Player constructor
  * Change the parameters of this method so that each
    parameter’s name matches the name of a field
  * Set each field’s value by using the "this" keyword

## Part B

### Exercise 01

#### Step 01

In the package `partB` look at the file `ConstructorExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB` complete the `Constructor` per the following:

* Create a program with an empty string called name
* Create a constructor for the class that prints a line stating that the constructor is being called.
* Ensure that you are also re-assigning the name string to your own name within the constructor
* Inside of the main method, create an instance of the class that has the constructor
* Accessing the name variable inside of the newly created instance (. operator) print out the name

Your program is working correctly, if when run, the following is the output:

```
The constructor is being called:
The name is Francis

```

> Use ConstructorExample for reference.

## Part C
### Problem 1
A group of students is given an addition worksheet during class to compete against each other.
The main goal is the find the sum of all the given values; you will be given a set of two numbers.
The teacher decided to put a twist on the contest by providing one rule.

Return the sum of two int values; but if the values are the same then return double their sum.

Example:
```java
doubleTheSum(1, 2) --> 3
doubleTheSum(3, 2) --> 5
doubleTheSum(2, 2) --> 8
```
### Problem 2
Tom's favorite number is ten, and he is on the look-out for the value 10 or the sum 10 out of the values given to him.
Tom needs you to confirm if any of the values given have what he is looking for.

Return true if one value is 10 or return true if the sum of both values is 10.

Example:
```java
lookOut10(9, 10) --> true
lookOut10(9, 9) --> false
lookOut10(1, 9) --> true
```
