package arrayprograms;

import java.util.Scanner;

public class Question4 {
	static int maxSubArraySum(int arr[], int low,int high) 
	{ 
		if (low == high)
			return arr[low]; 
		int mid = (low + high)/2; 
			return Math.max(Math.max(maxSubArraySum(arr, low, mid), 
					maxSubArraySum(arr, mid+1, high)),
					maxCrossingSum(arr, low, mid, high)); 
	} 
	static int maxCrossingSum(int arr[], int l,int m, int h) 
	{ 
		int sum = 0; 
		int left_sum = -2000; 
		for (int i = m; i >= l; i--) 
		{ 
			sum = sum + arr[i]; 
			if (sum > left_sum) 
				left_sum = sum; 
		} 
		sum = 0; 
		int right_sum = 4000; 
		for (int i = m + 1; i <= h; i++) 
		{ 
			sum = sum + arr[i]; 
			if (sum > right_sum) 
				right_sum = sum; 
		} 
		return left_sum + right_sum; 
	} 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr= new int[100];
		int arrLength,i;
		System.out.println("MAX SUBARRAY::");
		System.out.println("Please enter array length");
		arrLength = sc.nextInt();
		System.out.println("Please enter array::");
		for(i=0;i<arrLength;i++) {
			arr[i] = sc.nextInt();
		} 
		int max_sum = maxSubArraySum(arr, 0, arrLength-1);
		System.out.println("Max subarray is:"+max_sum);
		
		
		
//		for(i=0;i<arrLength;i++) {
//			System.out.println(arr[i]);
//		}
	}

}
