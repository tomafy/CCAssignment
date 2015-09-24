package hw2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution43 {
	public ArrayList<LinkedList<TreeNode>> createLinkedList(TreeNode root) {
		//Use Arraylist to store n lists
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> list = new LinkedList<TreeNode>();
		LinkedList<TreeNode> tmp = list;
		if (root != null)
			list.add(root);
		//Traverse every level of the tree, add the node into LinkedList until there is not subtree node
		while (tmp.size() != 0) {
			lists.add(tmp);
			LinkedList<TreeNode> nextlevel = new LinkedList<TreeNode>();
			for (int i = 0; i < tmp.size(); i++) {
				if (tmp.get(i).left != null) {
					nextlevel.add(tmp.get(i).left);
				}
				if (tmp.get(i).right != null) {
					nextlevel.add(tmp.get(i).right);
				}
			}
			tmp = nextlevel;
		}
		return lists;
	}
}
