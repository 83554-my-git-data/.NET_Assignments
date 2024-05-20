package com.sunbeam;

import java.util.Scanner;

public class BinarySearchMain {
	
	public static int binarySearch(int arr[], int N, int key) {
		int left = 0, right = N -1, comparision = 0;
		while(left <= right) {
			int mid = (left + right)/2;
			comparision++;	
			if(key == arr[mid])
				return comparision;
			else if(key < arr[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}
		return comparision;
	}

	public static void main(String[] args) {
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the key: ");
		int key = sc.nextInt();
		
		int comparision = binarySearch(arr, arr.length, key);
		
		System.out.println("No of Comparisions -> " + comparision);
		
		sc.close();
	}

}
