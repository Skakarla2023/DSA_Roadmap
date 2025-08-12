package com.skakarla.dsa;

public class InsertionSort {

	public static void main(String[] args) {
		int[] nums = {7, 8, 3, 1, 2};
		
		for(int i=1;i<nums.length;i++) {
			int curr = nums[i];
			int j =i-1;
			while(j >= 0 && curr < nums[j]) {
				nums[j+1] = nums[j];
				j--;
			}
			
			nums[j+1] = curr;
		}
		
		for(int num:nums) {
			System.out.print(num+" ");
		}
	}

}
