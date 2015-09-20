package hw1;
class ListNode {
    int val;
    ListNode next;
    ListNode(int v){val = v;}
}
public class Solution21 {
	
   public ListNode removeDups(ListNode n){
	   //Time Complexity: O(n)=n^2 Space Complexity: O(n)=1
	   //For each node, traverse rest nodes to remove the duplicate node
	   ListNode cur = n;
	   while(cur.next!=null){
		   ListNode temp = cur;
		   while(temp.next!=null){
			   if(temp.next.val==cur.val){
				   temp.next=temp.next.next;
			   }
			   temp=temp.next;
		   }
		   cur=cur.next;
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
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		Solution21 s = new Solution21();
		n1 = s.removeDups(n1);
		ListNode output=n1;
		while(output.next!=null){
			System.out.print((char)output.val+"->");
			output=output.next;
		}
		System.out.println((char)output.val);
	}
}
