package hw2;

public class Solution44 {
	//count the height of tree
	  public int getDepth(TreeNode node){
	        if(node == null) return 0;
	        return Math.max(getDepth(node.left), getDepth(node.right))+1;
	    }
	    public boolean isBalanced(TreeNode root) {
	        if(root==null) return true;
	        //check the height difference of two subtree
	        int heightdiff = Math.abs(getDepth(root.left)-getDepth(root.right));
	        if(heightdiff>1) return false;
	        return isBalanced(root.left) && isBalanced(root.right);
	    }
}
