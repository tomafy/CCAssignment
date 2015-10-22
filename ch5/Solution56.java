package hw4;

public class Solution56 {

public int countConversion(int n1, int n2){
	int count = 0;
	int n = n1^n2;
	while(n!=0){
		count++;
		n=n&(n-1);
	}
	return count;
}
public static void main(String[] args) {
	Solution56 s =new Solution56();
	System.out.print(s.countConversion(29, 15));
}
}
