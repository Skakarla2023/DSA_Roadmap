# 🧠 Java Basics: if, else, switch, Loops

## ✅ if, else if, else    

Used to run code based on conditions.

```java
int age = 20;

if (age < 18) {
    // if block
} else if (age == 18) {
    // else if block
} else {
    // else block
}
```

## 🔁 switch

Used to check multiple values for one variable.

```java
int day = 1;

switch(day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Other day");
}
```

## 🔂 for loop

Used when you know how many times to loop.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

## 🔄 while loop

Used when you don’t know how many times to loop (condition-based).

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

## 🔁 do-while loop

Runs the code at least once, then checks the condition.

```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```


| Statement  | Use Case                            |
| ---------- | ----------------------------------- |
| `if`       | Run block based on a condition      |
| `else if`  | Add multiple conditions             |
| `else`     | Default block if none match         |
| `switch`   | Multiple fixed cases to compare     |
| `for`      | Known number of iterations          |
| `while`    | Unknown loop count, condition-based |
| `do-while` | Like while, but runs at least once  |
