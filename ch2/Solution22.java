package hw1;

public class Solution22 {
	public ListNode returnKtoL(ListNode n, int k) {
		// Time Complexity O(n)=n, Space Complexity: O(n)=1
		ListNode n1 = n;
		int len = 1;
		//Traverse and get the length of list
		while (n1.next != null) {
			len++;
			n1 = n1.next;
		}
		//Move the point forward len-k positions
		for (int i = 0; i < len - k; i++) {
			n = n.next;
		}
		return n;
	}

	public static void main(String[] args) {
		ListNode n1 = new ListNode('F');
		ListNode n2 = new ListNode('O');
		ListNode n3 = new ListNode('L');
		ListNode n4 = new ListNode('L');
		ListNode n5 = new ListNode('O');
		ListNode n6 = new ListNode('W');
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		ListNode n = n1;
		Solution22 s = new Solution22();
		n = s.returnKtoL(n, 3);
		while (n.next != null) {
			System.out.print((char) n.val + "->");
			n = n.next;
		}
		System.out.println((char) n.val);
	}
}
