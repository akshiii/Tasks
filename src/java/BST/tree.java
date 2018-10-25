//package task3;

public class tree {
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
		else {
			root.left = add(root.left,val);
			root.right = add(root.right,val);
			}
		return root;
		
	}
	
}