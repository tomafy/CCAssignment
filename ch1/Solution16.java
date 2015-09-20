package hw1;

public class Solution16 {
 public String compressString(String original){
	 //Time complexity:O(n)=n Space Complecity: O(n)=n
	 String result="";
	 int count=1;//Count the num of current character
	 for(int i=1;i<original.length();i++){
		 if(original.charAt(i)==original.charAt(i-1)){ // Char is same as last char
			 count++;
		 }
		 else{ //Constructing new string
			 result=result+original.charAt(i-1)+count;
					 count=1;
		 }
	 }
	 result=result+original.charAt(original.length()-1)+count;//Add last char
	 if(original.length()<result.length()) result=original;//Compare the length
	 return result;
	 
 }
 public static void main(String[] args) {
	 Solution16 s = new Solution16();
	 System.out.println(s.compressString("aabcccccaaa"));
	 System.out.println(s.compressString("asdfggfdsa"));
 }
}
