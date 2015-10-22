package hw4;

public class Solution51 {
public int inserBit(int n, int m, int i , int j){
	int left = (~0) << (j+1);
	int right = ((1 << i)-1);
	int mask = left | right;
	
	m=m<<i;
	n=n&mask;
	return n|m;
}
public static void main(String[] args) {
	Solution51 s = new Solution51();
	System.out.print(Integer.toBinaryString(s.inserBit(0b10000000000, 0b10011, 2, 6)));
}
}
