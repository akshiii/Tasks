package arrayprograms;

import java.util.Scanner;

public class Question1 {
	static int flag=0;
	  
	   
    static void combinations(int arr[], int data[], int start, 
                                int end, int index, int r) 
    { 
    	int s[]=new int[r];
    	
        if (index == r) 
        { 
        	System.out.print("Combination:");
            for (int j=0; j<r; j++) { 
                System.out.print(data[j]+" "); 
                s[j]=data[j];
             }
            //if it is triangle
            if(s[0]+s[1]>s[2] && s[1]+s[2]>s[0] && s[2]+s[0]>s[1]) {
            	flag++;
            }
            
           
            System.out.println(" "); 
            return; 
        } 
  
       
        for (int i=start; i<=end && end-i+1 >= r-index; i++) 
        { 
            data[index] = arr[i]; 
            combinations(arr, data, i+1, end, index+1, r); 
        } 
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr= new int[100];
		int arrLength,i;
		System.out.println("Please enter array length");
		arrLength = sc.nextInt();
		System.out.println("Please enter array::");
		for(i=0;i<arrLength;i++) {
			arr[i] = sc.nextInt();
		}
		int r=3;
		 int[] data = new int[r];
        combinations(arr, data, 0, arrLength-1, 0, r);
       
        System.out.println("Triangles possible is :"+flag);
		
		
		
//		System.out.println("Result::");
//		for(i=0;i<arrLength;i++) {
//			System.out.println(arr[i]);
//		}
	}
}
