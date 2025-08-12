package com.skakarla.java_Programs;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] nums = {7, 8, 3, 1, 2};
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int smallest = i; 
            

            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[smallest]) {
                    smallest = j;
                }
            }

            
            int temp = nums[i];
            nums[i] = nums[smallest];
            nums[smallest] = temp;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

