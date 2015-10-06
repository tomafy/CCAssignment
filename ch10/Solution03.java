package hw3;

public class Solution03 {
	public int search(int[] nums, int target) {
		if (nums.length == 0)
			return -1;
		int n = nums.length;
		int lo = 0;
		int hi = n - 1;
		int mid = (lo + hi) / 2;
		// use binary search to find the minimum of array, find the original
		// head of array
		while (lo < hi) {
			if (nums[mid] > nums[hi])
				lo = mid + 1;
			else
				hi = mid;
			mid = (lo + hi) / 2;
		}
		int root = lo;
		lo = 0;
		hi = n - 1;
		mid = (lo + hi) / 2;
		// use binary search to find target num in the sorted array
		// new index is represent with original index
		while (lo < hi) {
			if (nums[(root + mid) % n] > target)
				hi = mid;
			else if (nums[(root + mid) % n] < target)
				lo = mid + 1;
			else
				return (root + mid) % n;
			mid = (lo + hi) / 2;
		}
		if (nums[(root + mid) % n] == target)
			return (root + mid) % n;
		return -1;
	}

	public static void main(String[] args) {
		int[] as = { 15, 16, 19, 20, 25, 1, 4, 5, 7, 10, 14 };
		Solution03 s = new Solution03();
		System.out.println(s.search(as, 10));
		System.out.println(s.search(as, 2));
	}
}
