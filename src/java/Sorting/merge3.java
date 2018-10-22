package proj;

import java.util.Scanner;


public class merge3 {
	static int[] a= new int[100];
	static int[] b= new int[100];
	
	static void merging(int low, int mid,int high) {
		    int l1, l2, i;

		   for(l1 = low, l2 = mid + 1, i = low; l1 <= mid && l2 <= high; i++) {
		      if(a[l1] <= a[l2])
		         b[i] = a[l1++];
		      else
		         b[i] = a[l2++];
		   }
		   
		   while(l1 <= mid)    
		      b[i++] = a[l1++];

		   while(l2 <= high)   
		      b[i++] = a[l2++];

		   for(i = low; i <= high; i++)
		      a[i] = b[i];
		}
	static void sort(int low, int high) {
		  int mid;
		   
		   if(low < high) {
		      mid = (low + high) / 2;
		      sort(low, mid);
		      sort(mid+1, high);
		      merging(low, mid, high);
		   } else { 
		      return;
		   }   
		}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		int arrLength,i,j,k;
		System.out.println("Please enter array length");
		arrLength = sc.nextInt();
		System.out.println("Please enter array::");
		for(i=0;i<arrLength;i++) {
			a[i] = sc.nextInt();
		}
		sort(0,arrLength-1); 
		  
        System.out.println("\nSorted array"); 
        for (i=0; i<arrLength; i++) 
            System.out.print(a[i] + " "); 

	}

}
