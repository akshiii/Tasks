import java.util.Scanner;

public class stackarray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
        Stack st = new Stack();        
       
        System.out.println(" Array Test\n"); 
        char ch;        
        do
        {
            System.out.println("\nArray Operations");
            System.out.println("1. Push/Insert");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. size");
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
            	System.out.println("Enter value to push");
            	st.push(scan.nextInt());

                break;                         
            case 2 : 
            	st.pop();
            	System.out.println("Data is popped.");                         
            	break;
 
            case 3 : 
            	
            	System.out.println("The data on top is"+ st.peek());
                break;  
            case 4:
            	System.out.println("The size of stack is"+ st.size());
            	
            	break;
 
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }                
                   
            st.display();
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);            
        } while (ch == 'Y'|| ch == 'y');                                                            
    

	}

}
