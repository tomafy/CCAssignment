package hw3;

public class Solution09 {
	public boolean searchMatrix(int[][] matrix, int target) {
        int n = 0;
        int m = matrix[0].length-1;
        int lo = 0;
        int hi = 0;
        int mid = 0;
        //begin searching from the upper right corner of matrix
        //use binary search to find the most nearest element
        while(m>=0&&n<matrix.length){
            if(matrix[n][m]<target){//if element less than target the pointer move down
                if(n==matrix.length-1) break;
                lo=n;
                hi=matrix.length-1;
                mid=(hi+lo)/2;
                while(lo<=hi){
                    if(matrix[mid][m]<target)
                     lo=mid+1;
                     else if(matrix[mid][m]>target)
                     hi=mid-1;
                     else return true;
                     mid=(hi+lo)/2;
                }
                n=lo; //if can't find the target element pointer move next level to shrink the searching scope
                m=m-1;
            }else if(matrix[n][m]>target){// if element bigger than target the pointer move to left
                if(m==0) break;
                lo=0;
                hi=m;
                mid=(lo+hi)/2;
                while(lo<=hi){
                    if(matrix[n][mid]<target)
                      lo=mid+1;
                      else if(matrix[n][mid]>target)
                      hi=mid-1;
                      else return true;
                      mid=(hi+lo)/2;
                }
                m=lo; //if can't find the target element pointer move next level to shrink the searching scope
                n=n+1;
            }
            else return true;
        }
        return false;
    }
	 public static void main(String[] args) {
			int[][] matrix={{1,   3,  5,  7},
					        {10, 11, 16, 20},
					        {23, 30, 34, 50}};
			Solution09 s = new Solution09();
			System.out.print(s.searchMatrix(matrix, 34));
			
		}
}
