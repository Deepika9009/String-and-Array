package com.jsp.array;
import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array:");
	int size = sc.nextInt();

	int arr[] = new int[size];

	System.out.println("Enter array elements:");
	for (int i = 0; i < arr.length; i++) {

		arr[i] = sc.nextInt();
	}
	System.out.println("Array elements are:");
	for (int i = 0; i < arr.length; i++) {

		System.out.print(arr[i]+ " ");
	}
}
}
