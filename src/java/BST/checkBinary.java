package task3;

import java.util.Scanner;

public class checkBinary {
	static int MIN=0;
	static int MAX=1000;
	
	
	static boolean isBinaryTree(Node root)
	{
		return isBST(root, MIN ,MAX);
	}
	
	static boolean isBST(Node root,int min, int max)
	{
		if(root==null) return true;
		if (root.data>min && root.data<max
				&& isBST(root.left, min , root.data)
				&& isBST(root.right, root.data, max))
				return true;
		
		else
			return false;
			
		
	}
	

	 public static void main(String[] args) { 
		    Scanner sc1= new Scanner(System.in);
		    tree tr = new tree();
		    int option=1;
		    int value;
		    boolean b;
		    
		    while(option!=0 ){
		        System.out.print("Enter the value for tree:");
		    	value= sc1.nextInt();
		    	tr.add(value);
		    	System.out.print("Want to enter more values? Enter 1 for YES and 0 for NO: ");
		    	option=sc1.nextInt();
		    	
		    }
		    
		    b=isBinaryTree(tr.root);
	        
		    if(b==true)
		    	System.out.print("The tree entered is a BST!!");
		    else
		    	System.out.print("The tree entered is NOT a BST!!");
	 }
}
