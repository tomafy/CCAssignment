package hw2;

public class Solution412 {
    public int getNumofpath(TreeNode p, int sum){
		if(p==null) return 0;
		//use recursive method to count the paths, begin from the root
		int paths=countPaths(p,sum,0);
		//count the left subtree and right subtree
		paths=paths+getNumofpath(p.left,sum);
		paths=paths+getNumofpath(p.right,sum);
		
    	return paths;    	
    }

	private int countPaths(TreeNode p, int sum, int current) {
		// TODO Auto-generated method stub
		if(p==null)return 0;
		//count the num of paths
		current=current+p.val;
		
		int paths = 0;
		if(current==sum){
			paths++;
		}
		paths=paths+countPaths(p.left,sum,current);
		paths=paths+countPaths(p.right,sum,current);
		return paths;
	}
    
}
