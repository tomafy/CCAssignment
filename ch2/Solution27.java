package hw1;


public class Solution27 {
 public boolean isIntersection(ListNode n1, ListNode n2){
	 //If two LinkedList are are intersected, they have same tail
	 int size1=0;
	 int size2=0;
	 ListNode tem1=n1;
	 ListNode tem2=n2;
	 //Count size of both two list
	 while(tem1!=null){
		 size1++;
		 tem1=tem1.next;
	 }
	 while(tem2!=null){
		 size2++;
		 tem2=tem2.next;
	 }
	 if(size2>size1){
		 ListNode n=n1;
		 n1=n2;
		 n2=n;
	 }
	 //Move the point of the longer list forward, let the length of two list be the same
	 for(int i=0;i<Math.abs(size1-size2);i++){
		 n1=n1.next;
	 }
	 //Compare nodes of 2 list
	 while(n1!=null){
		 if(n1.equals(n2)) return true;
		 n1=n1.next;
		 n2=n2.next;
	 }
	 return false;
 }
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		ListNode n7 = new ListNode(7);
		ListNode n8 = new ListNode(8);
		ListNode n9 = new ListNode(9);
		ListNode n10 = new ListNode(10);
		
		n1.next=n3;
		n2.next=n4;
		n3.next=n5;
		n4.next=n6;
		n5.next=n7;
		n6.next=n8;
		n7.next=n9;
		n8.next=n9;
		n9.next=n10;		
		Solution27 s=new Solution27();
		System.out.print(s.isIntersection(n1, n2));
	}

}
