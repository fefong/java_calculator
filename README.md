# Java Simple Calculator
Example Application: calculator

* [Java Simple Calculator](#Java-Simple-Calculator)
    * [Sum](#sum)
    * [Subtraction](#Subtraction)
	* [Multiplication](#Multiplication)
	* [Division](#Division)
	* [PI](#GET-PI)
	* [Exponent](#Exponent)
	* [Random](#Random)
	* [Square Root](#square-root-of-x)
* [Some links for more in depth learning](#Some-links-for-more-in-depth-learning)
	* [Operators](https://github.com/fefong/java_operators)

## Sum

```java
x + y
```

Example
```java
System.out.println(String.format("%.2f + %.2f = %.2f", x, y, x + y));
```

## Subtraction

```java
x - y
```

Example
```java
System.out.println(String.format("%.2f - %.2f = %.2f", x, y, x - y));
```

## Multiplication

```java
x * y
```

Example
```java
System.out.println(String.format("%.2f * %.2f = %.2f", x, y, x * y));
```

## Division

```java
x / y
```

Example
```java
System.out.println(String.format("%.2f / %.2f = %.2f", x, y, x / y));
````

## GET PI

Import: 
```java
import java.lang.Math;
```
Code:
```java
Math.PI
```

Example
```java
System.out.println("PI: " + Math.PI);
```

## Exponent

Import: 
```java
import java.lang.Math;
```
Code:
```java
Math.pow(x, y)
```

Example
```java
	System.out.println(String.format("%.2f ^ %.2f = %.2f", x, y, Math.pow(x, y)));
```

## Random

Import: 
```java
import java.lang.Math;
```

Generate random integers in a range.
```java
new Random().nextInt(x) 
```

Example
	
Random integer in a range between min: 0 (inclusive) and max: **X** (inclusive).

```java
System.out.println("Random Number: "+ new Random().nextInt(10));
```

## Square Root of x

Import: 
```java
import java.lang.Math;
```

Code:
```java
Math.sqrt(x)
```

Example	
```java
System.out.println(String.format("Square Root of %.2f = %.2f", x, Math.sqrt(x)));
```

## Some links for more in depth learning

* [Java OPERATORS](https://github.com/fefong/java_operators);
* [JAVA PRINT](https://github.com/fefong/java_print);
* [JAVA SWITCH CASE](https://github.com/fefong/java_switch);
* [JAVA IF/ELSE](https://github.com/fefong/java_ifElse);

