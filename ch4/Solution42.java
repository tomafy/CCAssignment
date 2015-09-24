package hw2;

public class Solution42 {
	public TreeNode createMinimaltree(int[] order, int start, int end) {
		//The root of the minimal height tree must be the mid of the array
		if (start > end)
			return null;
		int mid = (end - start) / 2;
		//Consider each subtree a new tree, use recurse to create each sub tree with sub array
		TreeNode tn = new TreeNode(order[mid]);
		tn.left = createMinimaltree(order, start, mid - 1);
		tn.right = createMinimaltree(order, mid + 1, end);
		return tn;
	}
}
