package hw1;

public class Solution23 {
	public void deleteMiddleNode(ListNode n) {
		//Let value of n become value of n.next and let the n.next point to n.next.next
		if (n == null || n.next == null)
			return;
		n.val = n.next.val;
		n.next = n.next.next;
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
		
		Solution23 s= new Solution23();
	    s.deleteMiddleNode(n3);
	    ListNode n = n1;
	    while (n.next != null) {
			System.out.print((char) n.val + "->");
			n = n.next;
		}
		System.out.println((char) n.val);
	}
}
