package com.sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = { 7, 8, 3, 1, 2 };
		// int arr[] = {1,2,3,7,8};

		BeforeSorting(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		AfterSorting(arr);
	}

	public static void BeforeSorting(int arr[]) {
		System.out.println("Before sorting:");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void AfterSorting(int arr[]) {
		System.out.println();
		System.out.println("After sorting:");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
