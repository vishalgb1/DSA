package com.sorting;

public class MergeSort {
	
	public static void divide(int arr[], int si, int ei) {
		
		int mid = si + (ei - si) / 2;
		divide(arr,si,mid);
		divide(arr,mid+1,ei);
	}
	
	
	public static void main(String[] args) {
		int arr[] = { 7, 8, 3, 1, 2 };
		
	}

}
