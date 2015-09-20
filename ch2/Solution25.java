package hw1;

public class Solution25 {
	public ListNode addTwo(ListNode n1, ListNode n2) {
		//Time Complexity:O(n)=n Space Complexity: O(n)=n
		// Add 2 digit if the sum >10, next calculate must plus 1
        ListNode r1 = new ListNode(0);
        ListNode result = r1;
        int sum = 0;
        while(n1 !=null || n2 != null){
        	sum = sum/10;//get the number to add
        	if(n1 != null){
        		sum = sum + n1.val;
        		n1 = n1.next;
        	}
        	if(n2 != null) {
        		sum = sum + n2.val;
        		n2 = n2.next;
        	}
        	r1.next = new ListNode(sum%10);
        	r1 = r1.next;
        }
        if(sum/10==1)
        	r1.next = new ListNode(1);
        return result.next;
	}	
	//Follow up: we can reverse the two list and add as the method above and then reverse the result to get the sum 
	public static void main(String[] args) {
		ListNode n1 = new ListNode(7);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(6);
		ListNode n4 = new ListNode(5);
		ListNode n5 = new ListNode(9);
		ListNode n6 = new ListNode(2);
		n1.next = n2;
		n2.next = n3;
		//n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		ListNode output = n1;
		Solution25 s = new Solution25();
		output = s.addTwo(n1, n4);
		String r1 = "";
		while (output.next != null) {
			System.out.print(output.val + "->");
			r1 = output.val+r1;
			output = output.next;
		}
		System.out.print(output.val + " ");
		r1 = output.val + r1;
		System.out.println("That's is:"+ r1);
	}
	
}
