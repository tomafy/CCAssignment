package hw1;

public class Solution14 {
  public boolean palindromePermutation(String s){
	  //Time Complexity:O(n)=n Space Complexity: O(n)=1
	  //The condition of palindrome permutation is there are only one or zero char with odd num
	  int[] flags= new int[57];//Using an array to count the num of char
	  int count=0;//Count the odd num char
	  for(int i=0;i<s.length();i++){
		  if(s.charAt(i)!=' '){
			  //If the num of char is odd count++, other wise count --
			  flags[s.charAt(i)-65]++;
			  if(flags[s.charAt(i)-65]%2==0) count--; 
			  else count++;
		  }
	  }
	  if(count<=1) return true;
	  else return false;	//More than one char has odd num  
  }
  public static void main(String[] args) {
  	Solution14 s = new Solution14();
  	System.out.println(s.palindromePermutation("taco cta"));
  	System.out.println(s.palindromePermutation("fsads s"));
  }
}
