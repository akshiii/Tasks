package proj;

import java.util.Scanner;

public class insertion {
	
	
	static void inser(int arr[],int n) {
		for (int i=1; i<n; i++) 
        { 
            int key = arr[i]; 
            int j = i-1; 
            while (j>=0 && arr[j] > key) 
            { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = key; 
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
		inser(arr,arrLength);
		System.out.println("Sorted array::");
		for(i=0;i<arrLength;i++) 
			System.out.print(arr[i] + " ");
	}

}
