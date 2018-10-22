
public class Queue {
	
	int qu[]=new int[100];
	int front, rear;
	int size;
	
	
	public Queue() {
		size=0;
		front=-1;
		rear=-1;
	}
	
	public void insert(int value) {
		
		if (rear == -1) 
        {
            front = 0;
            rear = 0;
            qu[rear] = value;
        }
        
        else 
            qu[++rear] = value;    
        size++ ;  
        
		
	}
	
	public void display() {
    	System.out.println("The queue is:");
		for(int i=0 ; i<size ; i++)
			System.out.print(qu[i] + " ");
	}
	
	public void remove() {
		 size-- ;
        
         if ( front == rear) 
         {
             front = -1;
             rear = -1;
         }
         else
             front++;                
        
	}
	
	public int peek() {
		int a=qu[rear];
		return a;
	}
	
	public int size() {
		return size;
		
	}
	
}