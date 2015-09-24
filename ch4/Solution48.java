package hw2;

public class Solution48 {
	   public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	       //use recurse method, bottom-up 
		   if(root==null||p==root||q==root) return root;
	        TreeNode left = lowestCommonAncestor(root.left,p,q);
	        TreeNode right = lowestCommonAncestor(root.right,p,q);
	        if(left!=null&&right!=null) return root;
	        else if(left==null) return right;
	        else return left;
	    }
}
