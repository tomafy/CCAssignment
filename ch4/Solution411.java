package hw2;

public class Solution411 {
	//size is the num of the nodes of the tree
	public TreeNode getRandomNode(TreeNode root) {
		int left = root.left.size;
		//Get the nodes according to the random num and size of the tree
		int x = 1 + (int) (Math.random() * root.size);
		if (x == left + 1)
			return root;
		else if (x < left + 1)
			return (getRandomNode(root.left));
		else
			return (getRandomNode(root.right));
	}

	public void insert(TreeNode root, int x) {
		TreeNode node = new TreeNode(x);
		if (root == null)
			root = node;// new tree
		// use recursive method to find a property position
		else if (x < root.val) {
			insert(root.left, x);
		} else {
			insert(root.right, x);
		}
		root.size++;//size increment
	}

	// use recurse method to dfs
	public TreeNode find(TreeNode root, int x) {
		if (root.val == x || root == null)
			return root;
		else if (root.val > x)
			return find(root.left, x);
		else
			return find(root.right, x);
	}

	// 3 situations
	public void remove(TreeNode root, int x) {
		if (find(root, x) == null) {
			System.out.println("Can't find the node!");
			return;
		}
		root.size--;//size decrement
		//use recursive method to find the node to be removed
		if (root.val > x) {
			remove(root.left, x);
		} else if (root.val < x) {
			remove(root.right, x);
		} else {
			//the tree has left and right subtree, then find the largest nodes on left tree
			//swap the val and remove the largest node
			if (root.left != null & root.right != null) {
				TreeNode p1 = root;
				TreeNode p = root.left;
				while (p.right != null) {
					p1 = p;
					p.size--;
					p = p.right;
				}
				p1.right = null;
				root.val = p.val;
			} else {// the node has one or no subtree,remove it and connect its parent and leave
				if (root.left == null)
					root = root.right;
				else
					root = root.left;
			}
		}

	}

}
