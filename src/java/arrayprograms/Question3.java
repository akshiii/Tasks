package arrayprograms;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr= new int[100];
		int arrLength,i;
		System.out.println(":::FIND Kth LARGEST VALUE:::");
		System.out.println("Please enter array length");
		arrLength = sc.nextInt();
		System.out.println("Please enter array::");
		for(i=0;i<arrLength;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Please enter value of k:");
		int k= sc.nextInt();
		String roman;
		switch(k)
		{
		   
		   case 1 :
		      roman="st";
		      break; 
		   
		   case 2 :
			   roman="nd";
		      break; 
		   case 3 :
			   roman="rd";
		      break;
		   
		   default : 
			   roman="st";
		      
		}
		int[] large= new int[k];
		if(k>=arrLength) {
			System.out.println("k should be less than arraylength");
			System.exit(0);
		}
		for(i=0;i<k;i++) {
			large[i]=arr[i];
		}
		int t=0,p;
		 if(k==1) {
			 for(p=k;p<arrLength;p++) {
				 if(large[0]<arr[p])
					 large[0]=arr[p];
			 }
				System.out.println(k+roman+" largest is "+large[0]);
				System.exit(0);
			}
		else {
        for(p=k,i=0 ; p<arrLength && i<k ; p++, i++)
        {
        		if(large[i]<arr[p])
        		{
        			large[i]=arr[p];
        			t=1;
        			//System.out.print("large[i]="+large[i]);
        			
        		}
        		
        	
        }
		}
//		 if(k==1) {
//		System.out.println(k+roman+" largest is"+large[0]);
//		System.exit(0);
//		 }
        int lar=large[0];
       
        //System.out.println("lar="+lar);
		for(i=0;i<k-1;i++)
		{
			if(large[i+1]<lar)
				lar=large[i+1];	
			
		}
		System.out.println(k+roman+" largest value is: "+lar);
		
		//System.out.println(k+" largest is::");
//		for(i=0;i<k;i++) {
//			System.out.println(large[i]);
//		}
		
	}
}
