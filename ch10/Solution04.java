package hw3;

import java.util.ArrayList;

//array-like data structure
class Listy {
	private ArrayList<Integer> lists = new ArrayList<Integer>();

	int elementAt(int i) {
		if (i > lists.size() - 1)
			return -1;
		else
			return lists.get(i);
	}
}

public class Solution04 {
	// use binary search idea to find the size
	// if the size is bigger then double the size
	public int search(Listy list, int target) {
		int x = 1;
		while (list.elementAt(x) != -1 && list.elementAt(x) < target) {
			x = x * 2;
		}
		return binSearch(list, target, x / 2, x);
	}

	// use binary search to search the index of target element
	public int binSearch(Listy list, int target, int lo, int hi) {
		int mid = (lo + hi) / 2;
		while (lo <= hi) {
			if (list.elementAt(mid) < target) {
				lo = mid + 1;
			} else if (list.elementAt(mid) > target || list.elementAt(mid) == -1) {
				hi = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
