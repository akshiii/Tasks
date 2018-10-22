import java.util.Scanner;


class queuearray {

	
	public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); 
        Queue lq = new Queue();        
       
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
            	System.out.println("Data is removed");                         
            	break;
 
            case 3 : 
            	
            	System.out.println("The data on top is"+ lq.peek());
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
