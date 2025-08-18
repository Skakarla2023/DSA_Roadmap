// Counting Sort

package com.skakarla.java_Programs;

public class Ternary_Search {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9, 11, 15, 18, 20 };
		int key = 15; 

		int index = ternarySearch(arr, 0, arr.length - 1, key);

		if (index != -1) {
			System.out.println("Element found at " + index);
		} else {
			System.out.println("Element not found.");
		}
	}

	private static int ternarySearch(int[] arr, int left, int right, int key) {

		int mid1 = left + (right - left) / 3;
		int mid2 = right - (right - left) / 3;

		if (key == arr[mid1]) {
			return mid1;
		}

		if (key == arr[mid2]) {
			return mid2;
		}

		if (key < mid1) {
			return ternarySearch(arr, left, right, key);
		}

		if (key > mid2) {
			return ternarySearch(arr, mid2 + 1, arr.length - 1, key);
		} else {
			return ternarySearch(arr, mid1 + 1, mid2 - 1, key);
		}
	}

}
