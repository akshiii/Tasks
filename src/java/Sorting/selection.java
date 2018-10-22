package proj;

import java.util.Scanner;

public class selection {
	
	static void select(int arr[], int n) {
		for(int i=0;i<n;i++) {
			int min=i;
			int k;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			
				k=arr[min];
				arr[min]=arr[i];
				arr[i]=k;
			
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr= new int[100];
		int arrLength,i,j,k;
		System.out.println("Please enter array length");
		arrLength = sc.nextInt();
		System.out.println("Please enter array::");
		for(i=0;i<arrLength;i++) {
			arr[i] = sc.nextInt();
		}
		select (arr,arrLength);
		System.out.println("Sorted array::");
		for(i=0;i<arrLength;i++) 
			System.out.print(arr[i] + " ");
		

	}

}
