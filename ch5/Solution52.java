package hw4;

public class Solution52 {
public String binToStr(double num){
	if(num>1||num<0){
		return "ERROR";
	}
	 StringBuffer str = new StringBuffer();
	 str.append("0.");
	 
	 while(num>0){
		 if(str.length()>32)
			 return "ERROR";
		 
		 double temp = num*2;
		 if(temp>=1){
			 str.append(1);
			 num=temp-1;
		 }else{
			 str.append(0);
			 num=temp;
		 }
	 }
	return str.toString();	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution52 s = new Solution52();
        System.out.println(s.binToStr(0.625));
	}

}
