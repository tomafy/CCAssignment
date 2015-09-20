package hw1;

public class Solution13 {
    public String URLify(String s, int length){
    	//Time Complexity:O(n)=n Space Complexity: O(n)=1
    	char[] url=s.toCharArray();
    	//Begin constructing at the end of string, to avoid overwriting
    	for(int i=url.length-1;i>=0;i--){  	
    		//Start analyzing origin string, check if there is a space
    		if(url[length-1]==' '){
    			//If it is space, replace it with %20 and using 2 more space
    			url[i]='0';
    			i--;
    			url[i]='2';
    			i--;
    			url[i]='%';
    		}else{
    			url[i]=url[length-1];
    		}
    		length--;
    	}
    	
    	return String.valueOf(url);
    }
    public static void main(String[] args) {
    	Solution13 s = new Solution13();
    	System.out.println(s.URLify("Mr John Smith    ", 13));
    }

}
