package hw2;

public class Solution45 {
	// in-order bottom-up iterate O(n)=n
	Integer lastprint = null;
	//left<root<right
	public boolean validateBST(TreeNode root) {
		if (root == null)
			return true;
		if (!validateBST(root.left))
			return false;
		if (lastprint != null && root.val <= lastprint)
			return false;
		lastprint = root.val;
		if (!validateBST(root.right))
			return false;
		return true;

	}
}
