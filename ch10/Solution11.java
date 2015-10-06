package hw3;

public class Solution11 {
 public void sortPandV(int[] nums){
	 //for every peek it must be bigger than the num near it 
	 //if right or left num bigger than it then swap it
	 for(int i=1;i<nums.length-1;i=i+2){
		 if(nums[i]>nums[i-1]){
			 int tmp = nums[i];
			 nums[i]=nums[i-1];
			 nums[i-1]=tmp;
		 }
		 if(nums[i]>nums[i+1]){
			 int tmp = nums[i];
			 nums[i]=nums[i+1];
			 nums[i+1]=tmp;
		 }
	 }
 }
 
 public static void main(String[] args) {
	 Solution11 s = new Solution11();
	 int[] nums = {5,8,6,2,3,4,6};
	 s.sortPandV(nums);
	 for(int i=0;i<nums.length;i++){
		 System.out.print(nums[i]+" ");
	 }
 }
}
