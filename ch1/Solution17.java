package hw1;

public class Solution17 {
    public void rotateMatrix(int[][] matrix, int n){
    	//Time Complexity: O(n)=n^2 Space Complexity:O(n)=1
    	for(int i=0;i<n/2;i++){//Rotate the matrix layer by layer
    		for(int j=i;j<n-1-i;j++){
    			int temp=matrix[i][j];
    			matrix[i][j] = matrix[n-1-j][i];
    			matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
    			matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
    			matrix[j][n-1-i] = temp;   			
    		}
    	}
    }
    public static void main(String[] args) {
    	Solution17 s =new Solution17();
        int[][] m1={{1,2,3,4,5},
     		       {6,7,8,9,10},
     		       {11,12,13,14,15},
     		       {16,17,18,19,20},
     		       {21,22,23,24,25}};
        s.rotateMatrix(m1, 5);
        for(int i=0;i<5;i++){
     	   for(int j=0;j<5;j++){
     		  System.out.print(m1[i][j]+" ");
     	   }
     	   System.out.println();
        }
    }
}
