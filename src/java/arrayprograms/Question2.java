package arrayprograms;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int arrLength;
		
		System.out.println("Please enter array length");
		arrLength = sc.nextInt();
		int[] arr= new int[arrLength];
		int[] arr0= new int[arrLength];
		int[] arr1= new int[arrLength];
		int[] arr2= new int[arrLength];
		int j=0;
		System.out.println("Please enter array(VALUES ONLY 0,1 OR 2)::");
		for(int i=0;i<arrLength;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<arrLength ; i++)
		{
			if(arr[i]==0) {
				
					arr0[j]=arr[i];
					j++;
			}
			
		}
		for(int i=0 ; i<arrLength ; i++)
		{
			if(arr[i]==1) {
				
					arr0[j]=arr[i];
					j++;
			}
			
		}
		for(int i=0 ; i<arrLength ; i++)
		{
			if(arr[i]==2) {
				
				arr0[j]=arr[i];
				j++;
		}
			
		}
		
	
		
		int a = arr0.length;
		//int b = arr1.length;
		//int c = arr2.length;
		System.out.println("Result::");
		for(int i=0 ; i<a ; i++) {
			
			System.out.print(arr0[i]+" ");
		}
	}
}
