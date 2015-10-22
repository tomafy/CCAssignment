package hw4;

public class Solution57 {
public int swapPairwise(int n){
	int even = (n&0xaaaaaaaa)>>>1;
	int odd = (n&0x55555555)<<1;
	return (even|odd);
}
public static void main(String[] args) {
	Solution57 s = new Solution57();
	System.out.println(Integer.toBinaryString(s.swapPairwise(0b10101101)));
}
}
