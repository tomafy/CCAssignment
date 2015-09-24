package hw2;

public class Solution46 {
	public TreeNode inorderSuccessor(TreeNode node) {
		if(node == null) return null;
		TreeNode successor = null;
		if(node.right!=null){//find the most left node in the right subtree
			successor=node.right;
			while(successor.left!=null){
				successor = successor.left;
			}
		}else{
			TreeNode temp=node;
			successor=node.parent;//node may in the left tree of the former node, find the node
			while(successor!=null && successor.left!=temp){
				temp=successor;
				successor=successor.parent;
			}
		}
		return successor;
	}
}
