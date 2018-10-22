package proj;

import java.util.Scanner;

public class heap {
	public static void sort(int arr[],int n) 
    { 
       
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapSort(arr, n, i); 
        for (int i=n-1; i>=0; i--) 
        { 
            int t = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = t; 
            heapSort(arr, i, 0); 
        } 
    } 
    static void heapSort(int arr[], int n, int i) 
    { 
        int large = i;
        int l = 2*i + 1; 
        int r = 2*i + 2;  
        if (l < n && arr[l] > arr[large]) 
            large = l; 
        if (r < n && arr[r] > arr[large]) 
            large = r; 
        if (large!= i) 
        { 
            int swap = arr[i]; 
            arr[i] = arr[large]; 
            arr[large] = swap; 
            heapSort(arr, n, large); 
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
		sort(arr,arrLength);
		System.out.println("Sorted array::");
		for(i=0;i<arrLength;i++) 
			System.out.print(arr[i] + " ");

	}

}
