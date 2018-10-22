package proj;

import java.util.Scanner;

public class quick2 {
	
	static void quicksort(int array[], int low, int high) {
		
	    int pivot, temp, index1, index2;

	    if(low < high)
	    {
	        //assigninh first element index as pivot element
	        pivot = low;
	        index1 = low;
	        index2 = high;

	        //Sorting in Ascending order with quick sort
	        while(index1 < index2)
	        {
	            while(array[index1] <= array[pivot] && index1 < high)
	            {
	                index1++;
	            }
	            while(array[index2]>array[pivot])
	            {
	                index2--;
	            }

	            if(index1<index2)
	            {
	                //Swapping opertation
	                temp = array[index1];
	                array[index1] = array[index2];
	                array[index2] = temp;
	            }
	        }

	        //At the end of first iteration, swap pivot element with index2 element
	        temp = array[pivot];
	        array[pivot] = array[index2];
	        array[index2] = temp;

	        //Recursive call for quick sort, with partiontioning
	        quicksort(array, low, index2-1);
	        quicksort(array, index2+1,high);
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
		quicksort(arr,0,arrLength-1);
		System.out.println("Sorted array::");
		for(i=0;i<arrLength;i++) 
			System.out.print(arr[i] + " ");


	}

}
