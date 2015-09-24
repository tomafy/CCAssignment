package hw2;

import java.util.Stack;

public class Solution35 {
	public void sortStack(Stack<Integer> s) {
	 Stack<Integer> temp = new Stack<Integer>();
	 //use method of selective sort to get a stack in which the mac elements is on the top
	 while(!s.isEmpty()){
		 int x = s.pop();
		 while(!temp.isEmpty()&&temp.peek()>x){
			 s.push(temp.pop());
		 }
		 s.push(x);
	 }
	 //push and pop, move all elements to origin stack, then reverse the elements
	 while(!temp.empty()){
		 s.push(temp.pop());
	 }
 }
}
