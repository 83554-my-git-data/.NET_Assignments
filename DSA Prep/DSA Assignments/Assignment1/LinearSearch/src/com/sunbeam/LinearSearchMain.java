package com.sunbeam;

import java.util.Scanner;

public class LinearSearchMain {

	public static int linearSearch(int arr[], int N, int key) {
		int comparision = 0;
		for(int i = 0; i < N; i++) {
			comparision++;
			if(arr[i] == key)
				return comparision;
		}
		return comparision;
	}
	
	public static void main(String[] args) {
		int arr[] = {22, 55, 44, 99, 77, 66, 11, 33, 88, 99};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the key :");
		int key = sc.nextInt();
		
		int comparision = linearSearch(arr, arr.length, key);
		
		System.out.println("No. of comparisions -> " + comparision);
		sc.close();
	}
}
