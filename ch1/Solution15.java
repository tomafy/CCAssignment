package hw1;

public class Solution15 {
    public boolean oneAway(String s1, String s2){
    	//Time Complexity: O(n)=n Space Complexity: O(n)=1
		if(Math.abs(s1.length()-s2.length())>2) return false;//Check length
		//Inserting a char to s1 is the situation as the removing a  char from s2 
		if(s1.length()>s2.length()){
			String tmp=s1;
			s1=s2;
			s2=tmp;
		}
		int i=0;
		int j=0;
		int count = 1;//count the num of difference between 2 strings
		while(i<s1.length()){
			if(s1.charAt(i)!=s2.charAt(j)){
				count--;
				if(count<0) return false;//The num of difference bigger than 1
				//When the length are not the same, it means that the string has removed or insert a char
				//The longer string back to last position and continue comparing
				if(s1.length()<s2.length()) i--;}
				i++;
				j++;
			
		}
    	return true;    	
    }
    public static void main(String[] args) {
    	Solution15 s = new Solution15();
    	System.out.println(s.oneAway("pale", "ple"));
    	System.out.println(s.oneAway("pales", "pale"));
    	System.out.println(s.oneAway("pale", "bale"));
    	System.out.println(s.oneAway("pale", "bake"));
    	
    	
    	
    }
}
