package hw1;

public class Solution24 {
	public ListNode Partiton(ListNode n, int par) {
		// Time Complexity O(n)=n, Space complexity O(n)=1
		ListNode head = n;
		ListNode result = n;
		//If Node.val < partition, than put the node to the head of list
		while (n.next != null) {
			if (n.next.val < par) {
				result = n.next;
				n.next = n.next.next;
				result.next = head;
				head = result;
			} else {
				n = n.next;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		ListNode n1 = new ListNode(5);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(6);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(8);
		ListNode n6 = new ListNode(2);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		ListNode output = n1;
		Solution24 s = new Solution24();
		output = s.Partiton(n1, 6);
		while (output.next != null) {
			System.out.print(output.val + "->");
			output = output.next;
		}
		System.out.println(output.val);
	}
}
