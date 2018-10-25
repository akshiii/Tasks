//package task3;

import java.util.Scanner;

class Binarytree { 
	public static void inOrder(Node root) {
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.getData()+" ");
		inOrder(root.right);
	}
	public static void preOrder(Node root) {
		if(root==null)
			return;
		System.out.print(root.getData()+" ");
		inOrder(root.left);
		inOrder(root.right);
	}
	public static void postOrder(Node root) {
		if(root==null)
			return;
		inOrder(root.left);
		inOrder(root.right);
		System.out.print(root.getData()+" ");
	}
	
 public static void main(String[] args) { 
    BST bst = new BST();
    /*bst.add(10);
    bst.add(5);
    bst.add(1);
    bst.add(7);
    bst.add(40);
    bst.add(50);
    */
    int option=1;
    Scanner sc= new Scanner(System.in);
    //System.out.println("Enter one value for tree:");
    int value;
    
    while(option!=0 ){
        System.out.print("Enter the value:");
    	value= sc.nextInt();
    	bst.add(value);
    	System.out.print("Want to enter more values? Enter 1 for YES and 0 for NO");
    	option=sc.nextInt();
    }
    System.out.println("Inorder for the binary tree is::");
    inOrder(bst.root);
    System.out.println("Preorder for the binary tree is::");
    preOrder(bst.root);
    System.out.println("Postorder for the binary tree is::");
    postOrder(bst.root);
 } 
} 

