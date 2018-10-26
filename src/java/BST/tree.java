package task3;

public class tree {
	int n=2;
	public Node root;
	
	public tree() {
		
		root= null;
	}
	public int visit() {
		return root.getData();
	}
	public void add(int val) {
		root = add(root,val);
	}
	public Node add(Node root, int val) {
		
		if (root == null)
			root= new Node(val);
			
		else if(n%2==0) {
			root.left = add(root.left,val);
			n++;
		}
		else {
			root.right = add(root.right,val);
			n++;
		}
		return root;
		
	}
	
}