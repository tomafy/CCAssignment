package hw1;


public class Solution11 {
    public boolean isUnique(String s){
    	//Time Complexity: O(n)=n Space Conplexity:O(n)=n
    	//Use a array to flag whether the character is already in the string
    	//Assume it is the Ascii string, there are 256 character
    	int[] flags = new int[256];
        for(int i=0;i<s.length();i++){
        	int temp = s.charAt(i);
        	if(flags[temp]==1) return false; //The character is already in  the string 
        	flags[temp]=1;//Flag the char        	
        }  
		return true;   	
    }
    public static void main(String[] args) {
    	Solution11 s = new Solution11();
    	System.out.println(s.isUnique("sdsadsd"));
    	System.out.println(s.isUnique("asdfghjkl"));
    }
}
