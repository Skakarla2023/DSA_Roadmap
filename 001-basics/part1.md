# ☕ Java Basics  
A quick reference for basic Java syntax and concepts, suitable for DSA beginners!  

---

## ✨ Basic Structure

public class Main {
    public static void main(String[] args) {
        // Code starts here
        System.out.println("Hello, Java!");
    }
}

---

## 📦 Data Types

Type       Example
int        int x = 10;
float      float f = 1.5f;
double     double d = 2.5;
char       char c = 'A';
boolean    boolean b = true;
String     String s = "Hi";

---

## 🔢 Operators

int a = 5, b = 2;

System.out.println(a + b);   // 7
System.out.println(a - b);   // 3
System.out.println(a * b);   // 10
System.out.println(a / b);   // 2
System.out.println(a % b);   // 1

System.out.println(a > b);   // true
System.out.println(a == b);  // false
System.out.println(a != b);  // true
System.out.println(a > b && b > 0); // true
System.out.println(a > b || b < 0); // true

---

## 🔄 Control Statements

### ✅ if, else if, else
Used to run code based on conditions.

int age = 20;

if (age < 18) {
    System.out.println("Minor");
} else if (age == 18) {
    System.out.println("Just Adult");
} else {
    System.out.println("Adult");
}

### 🔁 switch
Used to check multiple values for one variable.

int day = 1;

switch(day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Other day");
}

### 🔂 for loop
Used when you know how many times to loop.

for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

### 🔄 while loop
Used when you don’t know how many times to loop (condition-based).

int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}

### 🔁 do-while loop
Runs the code at least once, then checks the condition.

int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);

### ✨ enhanced for loop (arrays)

int[] arr = {1, 2, 3};
for (int x : arr) {
    System.out.println(x);
}

---

## 🧰 Methods

public static int add(int a, int b) {
    return a + b;
}

// Calling method
int sum = add(5, 3);
System.out.println(sum); // 8

---

## 🧱 Classes & Objects

class Car {
    String color;

    void drive() {
        System.out.println("Driving...");
    }
}

Car c = new Car();
c.color = "Red";
c.drive();  // Driving...

---

## 🧾 Arrays

int[] arr = {1, 2, 3};
System.out.println(arr[0]); // 1

---

## 📚 String Methods

String s = "Java";
s.length();       // 4
s.charAt(0);      // 'J'
s.toUpperCase();  // "JAVA"
s.toLowerCase();  // "java"
s.contains("av"); // true

---

## 📝 Type Casting

int i = 10;
double d = i;         // implicit casting

double x = 3.14;
int j = (int) x;      // explicit casting

---

## 💻 Input/Output

import java.util.Scanner;

Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = sc.nextInt();
System.out.println("Number: " + n);

---

## ⚠️ Exception Handling

try {
    int x = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}

---

## 📝 Comments

// This is a single-line comment

/*
   This is a
   multi-line comment
*/

---

## 🏷 Summary Table

| Statement      | Use Case                               |
|----------------|----------------------------------------|
| `if`           | Run block based on a condition         |
| `else if`      | Add multiple conditions                |
| `else`         | Default block if none match            |
| `switch`       | Multiple fixed cases to compare        |
| `for`          | Known number of iterations             |
| `while`        | Unknown loop count, condition-based    |
| `do-while`     | Like while, but runs at least once     |
| `enhanced for` | Loop through arrays/collections easily |
