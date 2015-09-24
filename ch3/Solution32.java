package hw2;

import java.util.Stack;

public class Solution32 {
	int min=Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    //push the current min before the new min
    public void push(int i){
    	if(i <= min){          
            stack.push(min);
            min=i;
        }
        stack.push(i);
    }
    
    public void pop(){
    	//if the min is pop, pop twice to get the last min
    	if(min==stack.peek()){
    		stack.pop();
    		min=stack.peek();
    		stack.pop();
    	}
    	else{
    		stack.pop();
    	}
    }
    
    public int getMin(){
    	return min;
    }
    
}
