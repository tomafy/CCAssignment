package hw3;

public class Solution08 {
//use bit vector to reprensent integer
	class bitSet{
		int[] bitset;
		public bitSet(int size){
			bitset = new int[(size>>5)+1];//divided by 32
		}
		
		boolean get(int index){
			int wordnum = (index >>5);//divide by 32
			int bitnum = (index&0x1F);//mod 32
			return (bitset[wordnum]&(1<<bitnum))!=0;
		}
		void set(int index){
			int wordnum = (index>>5);//divide by 32
			int bitnum = (index&0x1F);//mod 32
			bitset[wordnum] |=1<<bitnum;
		}
	}
	//find duplicate
	void findDup(int[] array){
		bitSet bs = new bitSet(32000);
		for(int i=0;i<array.length;i++){
			int num = array[i];
			int num0 = num-1;;//bitset starts at 0, nums starts at 1
			if(bs.get(num0)){
				System.out.println(num);
			}else{
				bs.set(num0);//set bitset to flag the num
			}
		}
	}
}
