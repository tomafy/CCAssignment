package hw3;

public class Solution01 {
	// m is size of nums1, n is size of nums2
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int size = m + n - 1;
		m--;
		n--;
		// traverse reversely and compare elements of two arrays
		// insert elements from the back to the head in order to avoid
		// overwriting
		while (n >= 0 && m >= 0) {
			if (nums1[m] > nums2[n]) {
				nums1[size] = nums1[m];
				m--;
			} else {
				nums1[size] = nums2[n];
				n--;
			}
			size--;
		}
		while (n >= 0) {
			nums1[n] = nums2[n];
			n--;
		}
	}

	public static void main(String[] args) {
		Solution01 s = new Solution01();
		int[] nums1 = { 1, 2, 6, 7, 9, 0, 0, 0, 0 };
		int[] nums2 = { 4, 8, 10, 14 };
		s.merge(nums1, 5, nums2, 4);
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + " ");
		}
	}
}
