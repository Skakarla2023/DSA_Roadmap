package com.skakarla.java_Programs;

public class String_Builder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Toy");
		System.out.println(sb);

		// print char at 0 index
		System.out.println(sb.charAt(0));

		// set char at 0 index
		sb.setCharAt(0, 'J');
		System.out.println(sb);

		// insert character at particular distance
		sb.insert(1, 'o');
		System.out.println(sb);

		// get the length of the string
		System.out.println(sb.length());

		// delete char at particular index
		sb.delete(1, 2);
		System.out.println(sb);

		// append a string at the end
		sb.append('f');
		sb.append('u');
		sb.append('l');
		System.out.println(sb);

		// reverse a string
		System.out.println(sb.reverse());
	}
}
