package hw2;

import java.util.ArrayList;
import java.util.Stack;

public class Solution33 {
    private int size;
	ArrayList<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();
    Solution33(){
    	stacks.add(new Stack<Integer>());
    }
    public void setSize(int s){
    	size=s;
    }
    //Check the stack is full or not, if its full, than new a stack and add in to arrayList
    public void push(int x){
    	if(stacks.get(stacks.size()-1).size()==size){
        Stack<Integer> nextstack=new Stack<Integer>();
        nextstack.push(x);
        stacks.add(nextstack);
    	}else{
    		stacks.get(stacks.size()-1).push(x);
    	}
    }
    //if the stack is empty after push, then remove it
    public int pop(){
    	int result=0;
    	if(stacks.size()==1&&stacks.get(0).isEmpty()){
    		System.out.println("There is no plate~");
    	}
    	else{
    		result=stacks.get(stacks.size()-1).pop();
    		if(stacks.get(stacks.size()-1).empty()){
    			stacks.remove(stacks.size()-1);
    		}
    	}
    	return result;
    }
    
}
