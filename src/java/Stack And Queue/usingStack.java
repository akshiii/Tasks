
public class usingStack {
	
	
	
	int stack1[]=new int[100];
	int stack2[]=new int[100];
	int size,size2;
	
	
	public usingStack(int s) {
		size=s;
		size2=0;
		
		
	}
	
	public void insert(int value) {
		
		stack1[size] = value;    
        size++ ; 
    
	}
	
	public void remove() 
	{
		while(size>0)
		{
			stack2[size2]=stack1[size];
			size--;
			size2++;
		}
		size2--;
		while(size2>0) 
		{
			stack1[size]=stack2[size2];
			size2--;
			size++;
		}
		
	}
	
	
	public void display() {
    	System.out.println("The queue is:");
		for(int i=0 ; i<size ; i++)
			System.out.print(stack1[i] + " ");
	}
	public int peek() {
		int a=stack1[size];
		return a;
	}
	
	public int size() {
		
		return size+1;
		
	}
	
	
	
	
}
