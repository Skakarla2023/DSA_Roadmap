# 📘 StringBuilder in Java

- StringBuilder is a mutable sequence of characters. Unlike String, which is immutable (cannot be changed after creation), StringBuilder allows you to modify the contents (append, delete, insert, etc.) without creating new objects.
- Every time you modify a String, Java creates a new object in memory.
- This is inefficient, especially inside loops or frequent concatenations.

### StringBuilder

- It performs faster string manipulations.
- Uses less memory by avoiding the creation of multiple objects.

```java
package com.skakarla.java_Programs;

public class String_Builder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Satwika");
		System.out.println(sb);

		// we can also print characters at particular index as we do for strings
		System.out.println(sb.charAt(0));
	}
}
```

Output:

Satwika
S

- One can also set the value i.e., modify the character at a particular index in a stringbuilder in java.

```java
package com.skakarla.java_Programs;

public class String_Builder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Satwika");
		System.out.println(sb);

		// we can also print characters at particular index as we do for strings
		System.out.println(sb.charAt(0));
		
		// set char at index 0
		sb.setCharAt(0, 'R');
		System.out.println(sb);
		
	}
}
```

- we can also insert a character at a particular index using insert() function() in StringBuilder.

```java
package com.skakarla.java_Programs;

public class String_Builder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Satwika");
		System.out.println(sb);

		// insert a value at a particular index
		sb.insert(0, 'S');
		System.out.println(sb);
		
	}
}
```

Output:
```
Satwika
SSatwika
```

- Look at this code snippet

```java
package com.skakarla.java_Programs;

public class String_Builder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);

		// we can also print characters at particular index as we do for strings
		System.out.println(sb.charAt(0));
		
		// insert n at 2nd index
		sb.insert(2, 'n');
		System.out.println(sb);
	}
}
```

Output:
```
Tony
T
Tonny
```

- We can also delete a character from a particular index using delete() function.
- In delete function we need to provide the starting and ending index of that substring which we want to delete from that String.
- But it will delete the character whose indices are of the range starting to end-1.

```java
package com.skakarla.java_Programs;

public class String_Builder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);

		//delete characters at particular index
		sb.delete(2,3);
		System.out.println(sb);
	}
}
```

Output:
```
Tony
Toy
```

- We can also append characters at end of the string one by one.

```java
package com.skakarla.java_Programs;

public class String_Builder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Toy");
		System.out.println(sb);

		// append characters to the string
		sb.append(" ");
		sb.append("S");
		sb.append("t");
		sb.append("o");
		sb.append("r");
		sb.append("y");
		
		System.out.println(sb);
	}
}
```

Output:
```
Toy
Toy Story
```

- We can use the length() fucntion to return the length of the string, just as we do in Strings.

```java
package com.skakarla.java_Programs;

public class String_Builder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Toy");
		System.out.println(sb);

		System.out.println(sb.length());
		
	}
}
```

Output:
```
Toy
3
```

- We can reverse a string in StringBuilder in java using the reverse() method.

```java
package com.skakarla.java_Programs;

public class String_Builder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Toy");
		System.out.println(sb);

		System.out.println(sb.reverse());
		
	}
}
```

Output:
```
Toy
yoT
```

