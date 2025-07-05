package com.skakarla.dsa;

public class Patterns {
	public static void main(String[] args) {

		System.out.println("Pattern:1");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Pattern:2");
		int n = 4, m = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (i == 1 || j == 1 || i == n || j == m) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Pattern:3");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

		System.out.println();

		System.out.println("Pattern:4");
		for (int i = 4; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

		System.out.println(" ");
		
		System.out.println("Pattern:5");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println("");
		}
	}
}
