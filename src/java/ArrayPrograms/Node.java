package arrayprograms;

public class Node {
	public Node next;
	 int data;
	// public Node head;
	 
	 public Node() {
		 next= null;
		 data =0;
		
	 }
	 public Node(int val) {
		 next=null;
		 this.data = val;
	 }
	 public void setData(int val) {
		 this.data= val;
	 }
	 public int getData() {
		 return data;
	 }
}

