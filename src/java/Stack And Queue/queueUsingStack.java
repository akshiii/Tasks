import java.util.Scanner;


public class queueUsingStack {

public static int[]  createArray(int size) {
	int ar[]=new int[size];
	return ar;
}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of queue");
    	int size=scan.nextInt();
    	
    	
    	
        usingStack lq = new usingStack(size);    
        
        System.out.println("Enter "+size +" values now");
    	for(int i=0;i<size;i++)
    	{
    		int a=scan.nextInt();
    		lq.stack1[i] = a;
    	}
        
        
        
       
        System.out.println(" Queue Test\n"); 
        char ch; 
        
       
    	
        do
        {
        	
            System.out.println("\nQueue Operations");
            System.out.println("1. insert");
            System.out.println("2. remove");
            System.out.println("3. peek");
            System.out.println("4. size");
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
            	System.out.println("Enter value to insert");
            	lq.insert(scan.nextInt());

                break;                         
            case 2 : 
            	lq.remove();
            	System.out.println("Front value is removed");                         
            	break;
 
            case 3 : 
            	
            	System.out.println("The data on rear is"+ lq.peek());
                break;  
            case 4:
            	System.out.println("The size of queue is"+ lq.size());
            	
            	break;
 
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }                
                   
            lq.display();
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);            
        } while (ch == 'Y'|| ch == 'y');  

	}

}
