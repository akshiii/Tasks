package proj;

import java.util.Scanner;

public class bubble {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr= new int[100];
		int arrLength,i,j,k,p;
		System.out.println("Please enter array length");
		arrLength = sc.nextInt();
		System.out.println("Please enter array::");
		for(i=0;i<arrLength;i++) {
			arr[i] = sc.nextInt();
		}
		
		for( j=0;j<arrLength;j++)
			for(k=0;k<j;k++) {
				if(arr[j]<arr[k]) {
					p=arr[j];
					arr[j]=arr[k];;
					arr[k]=p;
				}
				
			}
		
		System.out.println("Result::");
		for(i=0;i<arrLength;i++) {
			System.out.println(arr[i]);
		}
	}

}
