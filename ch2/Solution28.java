package hw1;
public class Solution28 {
  public ListNode detectLoop(ListNode n){
	  //Time complexity O(n)=n, Space complexity O(n)=1
	  //Set 2 point, p1 move faster than p2, if there is a loop, p1 and p2 will meet at some position
	  if(n==null||n.next==null) return null;
	  
	  ListNode p1=n;
	  ListNode p2=n;
	  
	  while(p2!=null&&p2.next!=null){
		  p2=p2.next.next;
		  p1=p1.next;
		  if(p1.equals(p2)) break;
	  }
	  
	  if(p2 == null) return null;//No loop
	  p1=n;

	  while(!p1.equals(p2)){
		  p1=p1.next;
		  p2=p2.next;
	  }
	  	  return p1;	  
  }
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ListNode n1 = new ListNode(5);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(6);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(4);
		//ListNode n6 = new ListNode(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n1;
		Solution28 s = new Solution28();
		System.out.println(s.detectLoop(n1).val);
		
		
		
  }
}
