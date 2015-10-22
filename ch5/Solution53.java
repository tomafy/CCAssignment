package hw4;

import java.util.ArrayList;

public class Solution53 {
 public int longestone(int n){
	 if(n==-1) return 32;
	 int max = 1;
	 ArrayList<Integer> counts = new ArrayList<Integer>();
	 int count = 0;
	 int flag = 0;
	 for(int i=0;i<32;i++){
		 if((n&1)!=flag){
			counts.add(count);
			flag = n&1;
			count = 0;
		 }
		 count++;
		 n=n>>>1;
	 }
	 counts.add(count);
	 for(int i=0;i<counts.size();i=i+2){
		 int zero = counts.get(i);
		 int right = 0;
		 if(i>0){
			 right = counts.get(i-1);
		 }
		 int left =0;
		 if(i<counts.size()-1){
			 left = counts.get(i+1);
		 }
		 
		 int current =0;
		 if(zero==1){
			 current = right+left+1;
		 }else if(zero>1){
			 current=Math.max(left+1, right+1);
		 }else{
			 current=Math.max(left, right);
		 }
		 max = Math.max(max, current);
	 }
	 return max; 
 }
 public static void main(String[] args) {
	 Solution53 s = new Solution53();
	 System.out.println(s.longestone(0b111011111011));
 }
}
