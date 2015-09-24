package hw2;


public class Solution31 {  
	//Divide the array into 3 stacks, each of them has fixed sized
	int size = 100; 
	//The pointer of stacks
	int[] stackpointer={-1,-1,-1};
	int[] stacks = new int[size*3];
	//push in specific stack
	public void push(int num, int value) {  
		if(stackpointer[num-1]>size){
			System.out.println("The stack is full");
			return;
		}
		stackpointer[num-1]++;
		stacks[(num-1)*size+stackpointer[num-1]]=value;
	}
	
	public int pop(int num){
		if(stackpointer[num-1]==-1){
			System.out.println("The stack is empty");
			return 0;
		}
		int popvalue=stacks[(num-1)*size+stackpointer[num-1]];
		stackpointer[num-1]--;
		return popvalue;
	}
	public int peek(int num){
		return stacks[(num-1)*size+stackpointer[num-1]];
	}
	public boolean empty(int num){
		return stackpointer[num-1]==-1;		
	}
	 public static void main(String[] args) {
		
	 }
}
