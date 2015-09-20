package hw1;

public class Solution18 {
     public void zeroMatrix(int[][] matrix, int m, int n){
    	 //Time Complexity: O(n)=n^2 Space Complexity:O(n)=1
    	 boolean row0=false;
    	 boolean co0=false;
    	 for(int i=0;i<n;i++){//Check if the 1st row has a zero
    		 if(matrix[0][i]==0){
    			 row0=true;
    			 break;
    		 }
    	 }
    	 for(int i=0;i<m;i++){//Check if the 1st column has a zero 
    		 if(matrix[i][0]==0){
    			 co0=true;
    			 break;
    		 }
    	 }

    	 for(int i=1;i<m;i++){// Using 1st row and 1st column to record which row and which column has zero
    		for(int j=1;j<n;j++){
    			if(matrix[i][j]==0){
    				matrix[0][j]=0;
    				matrix[i][0]=0;
    			}
    		}
    	}
    	 for(int i = 1; i < matrix.length; i++) {//Set the matrix zero
    	        for(int j = 1; j < matrix[0].length; j++) {
    	            if(matrix[i][0] == 0 || matrix[0][j] == 0) {
    	                matrix[i][j] = 0;
    	            }
    	        }
    	    }
    	if(row0){//Set the 1st row zero
    		for(int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
    	}
    	if(co0){//Set the 1st column zero
    		for(int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
    	}
     }
     public static void main(String[] args) {
     	Solution18 s =new Solution18();
     	int r = 5;
     	int c = 4;
         int[][] m1={{1,0,3,4},
      		         {6,7,0,9},
      		         {11,12,13,14},
      		         {16,0,18,19},
      		         {6,22,23,24}};
         s.zeroMatrix(m1, r, c);
         for(int i=0;i<r;i++){
      	   for(int j=0;j<c;j++){
      		  System.out.print(m1[i][j]+" ");
      	   }
      	   System.out.println();
         }
     }
}
