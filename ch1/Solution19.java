package hw1;

public class Solution19 {
    public boolean stringRotation(String s1, String s2){
		//Time complexity= O(n)(the complexity of isSubtring method)
    	if(s1.length()!=s2.length()) return false;//Check length
	    //if s2 is a rotation of s1, s2 must be a substring of s1s1   
    	s1=s1+s1;
    	return isSubstring(s1,s2); 	
    }
    public boolean isSubstring(String s, String sub){
    	return s.contains(sub);
    }
    public static void main(String[] args) {
    	Solution19 s = new Solution19();
    	System.out.println(s.stringRotation("waterbottle", "erbottlewat"));
    }
    
}
