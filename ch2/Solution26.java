package hw1;

public class Solution26 {
	public boolean isPalindrome(ListNode n){
		//Time Complexity: O(n)=n Space Complexity: O(n)=1
		//Set 2 point, p1 move forward 1 step and p2 move 2 steps, when p2 reach tail, p1 reach middle point
		if(n==null) return false;
		ListNode p1=n;
		ListNode p2=n;				
		ListNode temp=n;
		while(p2.next!=null&&p2.next.next!=null){
		p1=p1.next;
		p2=p2.next.next;
		}
		//Reverse second half of List
		p1=p1.next;
		temp=p1;
		p2=p1;
		while(temp.next!=null){
	     p1=temp.next;
	     temp.next=temp.next.next;
	     p1.next=p2;
	     p2=p1;     
		}
		//Compare the value of Node
		while(p1!=null){
	    if(p1.val!=n.val){
	    	return false;
	    }
	    p1=p1.next;
	    n=n.next;
		}
		return true;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(5);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(6);
		ListNode n4 = new ListNode(6);
		ListNode n5 = new ListNode(3);
		ListNode n6 = new ListNode(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		Solution26 s=new Solution26();
		System.out.print(s.isPalindrome(n1));
	}

}
