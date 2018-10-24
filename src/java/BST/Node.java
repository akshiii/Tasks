package task3;

public class Node {
	public Node left,right;
	 int data;
	 
	 public Node() {
		 left= null;
		 right=null;
		 data =0;
		
	 }
	 public Node(int val) {
		 left=right=null;
		 this.data = val;
	 }
	 public void setData(int val) {
		 this.data= val;
	 }
	 public int getData() {
		 return data;
	 }
}

