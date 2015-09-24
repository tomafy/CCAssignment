package hw2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution49 {
ArrayList<LinkedList<Integer>> getSequences(TreeNode root){
	ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();
	if(root==null) return result;
	
	LinkedList<Integer> pre=new LinkedList<Integer>();
	pre.add(root.val);
	//recursing method to count two subtree method
	ArrayList<LinkedList<Integer>> left=getSequences(root.left);
	ArrayList<LinkedList<Integer>> right=getSequences(root.right);
	
	for(int i =0;i<left.size();i++){
		for(int j =0;j<right.size();j++){
			ArrayList<LinkedList<Integer>> sequences=new ArrayList<LinkedList<Integer>>();
			combineList(left.get(i), right.get(j),sequences,pre);
		}
	}
	return result;
}
//combine elements in two lists and make the relative order of the elements in same list won't change
public void combineList(LinkedList<Integer> left, LinkedList<Integer> right,
		ArrayList<LinkedList<Integer>> ses, LinkedList<Integer> pre){
	if(left.isEmpty()||right.isEmpty()){
		@SuppressWarnings("unchecked")
		LinkedList<Integer> result = (LinkedList<Integer>) pre.clone();
		result.addAll(left);
		result.addAll(right);
		ses.add(result);
		return;
	}
	
	//recurse with the root addede to pre first
	//restore the elements
	int head=left.removeFirst();
	pre.addLast(head);
	combineList(left,right,ses,pre);
	pre.removeLast();
	left.addFirst(head);

	//right side
	head=right.removeFirst();
	pre.addLast(head);
	combineList(left,right,ses,pre);
	pre.removeLast();
	right.addFirst(head);
}
}
