
public class Stack {

	int st[]=new int[100];
	int top;
	int size;
	
	
	public Stack() {
		size=0;
		top=-1;
		
	}
	
	public void push(int value) {
		
		if (top == -1) 
        {
            
            top = 0;
            st[top] = value;
        }
        
        else 
            st[++top] = value;    
        size++ ;  
        
		
	}
	
	public void display() {
    	System.out.println("The stack is:");
		for(int i=0 ; i<size ; i++)
			System.out.print(st[i] + " ");
	}
	
	public void pop() {
		 size-- ;
         top++;               
         
	}
	
	public int peek() {
		int a=st[top];
		return a;
	}
	
	public int size() {
		return size;
		
	}
}
