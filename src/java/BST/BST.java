//package task3;

public class BST {
	public Node root;
	
	public BST() {
		
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
		else if (root.getData()>val)
			root.left = add(root.left,val);
		else if (root.getData()<val)
			root.right = add(root.right,val);
		return root;
		
	}
	
}
