# 📚 Java Arrays 

Arrays in Java are a **data structure** used to store multiple values of the same data type in a single variable. They offer a convenient way to group related data items and access them using an index.

---

## 📌 What is an Array?

An **array** is a container object that holds a fixed number of elements of a single type. The length of an array is established when the array is created.

```java
int[] numbers = new int[5]; // Declaration + Memory allocation
```

## 🛠 Array Declaration

There are two common ways to declare an array:

```java
// Method 1: Declaration and allocation separately
int[] arr;       // Preferred in Java
arr = new int[3];

// Method 2: Declaration + allocation together
int[] arr = new int[3];
```

### 🔄 Array Initialization

#### ✅ Static Initialization

```java
int[] numbers = {10, 20, 30, 40, 50};
```

#### ✅ Dynamic Initialization

```java
int[] numbers = new int[5];
numbers[0] = 10;
numbers[1] = 20;
//Index starts at 0 and ends at length - 1
```

### 🧾 Accessing Array Elements

```java
System.out.println(numbers[0]); // prints 10
```

### 🔁 Traversing Arrays

- Using for loop:

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

- Using enhanced for loop:

```java
for (int num : numbers) {
    System.out.println(num);
}
```

#### ⚠️ Common Error: ArrayIndexOutOfBoundsException

```java
int[] arr = {1, 2, 3};
System.out.println(arr[3]); // ❌ Error: Index 3 out of bounds
```

- Always make sure your index is within bounds: 0 to array.length - 1.

### 🧱 Array of Objects

- Arrays can also store objects like String, Employee, etc.

```java
String[] names = {"Alice", "Bob", "Charlie"};
for (String name : names) {
    System.out.println(name);
}
```
