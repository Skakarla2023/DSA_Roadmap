# ☕ Java Cheat Sheet
A quick reference for basic Java syntax and concepts!

## ✨ Basic Structure

```java
public class Main {
    public static void main(String[] args) {
        // Code starts here
        System.out.println("Hello, Java!");
    }
}
```

## 📦 Data Types
```java
Type	Example
int	int x = 10;
float	float f = 1.5f;
double	double d = 2.5;
char	char c = 'A';
boolean	boolean b = true;
String	String s = "Hi";
```

## 🔄 Control Statements

### if-else

```java
if (a > b) {
    // do something
} else {
    // do something else
}
```

### switch

```java
switch(x) {
    case 1: break;
    default: break;
}
```

### Loops

```java
// for loop
for (int i = 0; i < 5; i++) { }

// while loop
while (condition) { }

// do-while loop
do { } while (condition);
```

## 🧰 Methods

```java
public static int add(int a, int b) {
    return a + b;
}
```

## 🧱 Classes & Objects

```java
class Car {
    String color;

    void drive() {
        System.out.println("Driving...");
    }
}

Car c = new Car();
c.color = "Red";
c.drive();
```

## 🧾 Arrays

```java
int[] arr = {1, 2, 3};
System.out.println(arr[0]); // 1
```

## 📚 String Methods

```java
String s = "Java";
s.length();     // 4
s.charAt(0);    // 'J'
s.toUpperCase();// "JAVA"
```
