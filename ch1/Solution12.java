package hw1;

public class Solution12 {
   public boolean checkPermutation(String s1, String s2){
	   //s1 and s2 must has same num of each char
	   if(s1.length()!=s2.length()) return false; //Check length
	   //Assume it is Ascii string, use an array to record the num of each char
	   int[] flags = new int[256];
	   int temp = 0;
	   for(int i=0;i<s1.length();i++){//Count num of each char in thr 1st string
		   temp = s1.charAt(i);
		   flags[temp]++;
	   }
	 //Check whether the char in the 2nd String has the same num as in the 1st String 
	   for(int i=0;i<s2.length();i++){ 
		   temp = s2.charAt(i);
		   flags[temp]--; //
		   if(flags[temp]<0) return false;
	   }
	   return true;	   
   }
   public static void main(String[] args) {
	   Solution12 s= new Solution12 ();
	   System.out.println(s.checkPermutation("asdfgh", "dfsagh"));
	   System.out.println(s.checkPermutation("asdfgh", "zxcvbn"));
   }
}
