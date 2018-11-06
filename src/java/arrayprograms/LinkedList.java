package arrayprograms;

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
		  
		        li.add(1); 
		        li.add(2);
		        li.add(3);
		        li.add(4);
		        
		          
		        
		        li.head.next.next.next.next = li.head; 
		  
		        int len = li.loop(); 
		        System.out.println("Length of loop is:"+len);
		    } 
	

}
