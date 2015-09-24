package hw2;

public class Solution410 {
	public boolean checkSubtree(TreeNode p, TreeNode q) {
		boolean result = false;
		//travers the p tree to find a node whose val equals the val of q
		if (p != null && q != null) {
			if (p.val == q.val)
				//Check the structure of the sub tree
				result = checkStructure(p, q);
			if (!result)
				//Then check left subtree
				result = checkStructure(p.left, q);
			if (!result)
				//Then check right subtree
				result = checkStructure(p.right, q);
		}
		return result;
	}

	public boolean checkStructure(TreeNode p, TreeNode q) {
		//compare each nodes
		if (p == null)
			return false;
		if (q == null)
			return true;
		if (p.val != q.val)
			return false;
		return checkStructure(p.left, q.left) && checkStructure(p.right, q.right);
	}
}
