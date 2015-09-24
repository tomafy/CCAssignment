package hw2;


import java.util.Stack;

public class Solution34 {
	Stack<Integer> instack=new Stack<Integer> ();
	Stack<Integer> outstack=new Stack<Integer> ();	
	
	 // Push element x to the back of queue.
    public void add(int x) {
        instack.push(x);
    }

    // Removes the element from in front of queue.
    public void remove() {
        peek();
        outstack.pop();
    }

    // Get the front element.
    public int peek() {
        if(outstack.empty()) {
        	while(!instack.empty()) {
        		outstack.push(instack.pop());
        	}
        }
        return outstack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return (instack.empty() && outstack.empty());
    }
}
