package arrayprograms;

import java.util.Scanner;

public class LinkedList {


		//int n=2;
		public Node head;
		public void add(int val) {
			//new_node = add(new_node,val);
			 Node new_node = new Node(val); 
			   
		       
		        new_node.next = head; 
		        head = new_node;
		}
		public int loop(){
			Node slow=head;
			Node fast=head;
			int a=1;
			while(slow!=null && fast!=null && fast.next!=null)
			{
				slow=slow.next;
				fast=fast.next.next;
				if(slow==fast)
				{
					System.out.println("loop found");
					  
					Node temp = slow;  
					while (temp.next != slow)  
					{  
					    a++;  
					    temp = temp.next;  
					}  
					return a;
				}
			}
			return 0;
			
		}
		 public static void main(String args[]) 
		    { 
		        LinkedList li = new LinkedList(); 
		        Scanner sc= new Scanner(System.in);
		        int listLength,i,val;
				System.out.println("Please enter List length");
				listLength = sc.nextInt();
				if(listLength>1) {
				System.out.println("Please enter List values::");
				for(i=0;i<listLength;i++) {
					val = sc.nextInt();
					li.add(val);
				}
				}
				else
					System.out.println("Please enter more than 1 values for a list to have loop..");
		        
		         
		        
		        li.head.next.next = li.head; 
		  
		        int len = li.loop(); 
		        System.out.println("Length of loop is:"+len);
		    } 
	

}
