package hw3;

class Node {
	public int leftSize = 0;
	public Node left;
	public Node right;
	public int val;

	public Node(int v) {
		val = v;
	}
}
//use the property of BST to find the num
//the node in the left subtree must be less than the parent and in the right subtree must be bigger than the pareant nodes
public class Solution10 {
public int getRank(int d, Node root){
   if(root.val == d){
	   return root.leftSize;  
   }else if(d<root.val){
	   if(root.left==null) return -1;
	   else return getRank(d,root.left);
   }else{
	   if(root.right==null) return -1;
	   else return root.leftSize+1+getRank(d,root.right);
   }
}

public void insert(int d, Node root){
	if(d<=root.val){
		if(root.left != null) insert(d,root.left);
		else root.left = new Node(d);
		root.leftSize++;
	}else{
		if(root.right != null) insert(d,root.right);
		else root.right = new Node(d);
	}
}
}
