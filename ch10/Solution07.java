package hw3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Solution07 {
//Use bit vector with 8 billion bits
	long numberOfint = ((long)Integer.MAX_VALUE)+1;
	byte[] bv = new byte[(int) (numberOfint/8)];
	String filename = "...";
	
	void findNum() throws FileNotFoundException{
		Scanner in = new Scanner(new FileReader(filename));
		while(in.hasNextInt()){
			int x = in.nextInt();
			bv[x/8] |=1<<(x%8);			
		}
		 for(int i=0;i<bv.length;i++){
			 for(int j = 0;j<8;j++){
				 //retrieve  the each bit of each byte. When 0 bit is found, current value is the expected value
				 if((bv[i]&(1<<j))==0){
					 System.out.println(i*8+j);
					 return;
				 }
			 }
		 }
	}
}
