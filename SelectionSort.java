package com.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = { 7, 8, 3, 1, 2 };
		// int arr[] = {1,2,3,7,8};
		beforeSorting(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		afterSorting(arr);
	}

	public static void beforeSorting(int arr[]) {
		System.out.println("Before Sorting");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void afterSorting(int arr[])
	{
		System.out.println();
		System.out.println("After Sorting");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
	}


}
