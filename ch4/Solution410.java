package hw2;

public class Solution410 {
    
    public boolean checkSubtree(TreeNode p, TreeNode q) {
        if(q==null) return true;//empty tree is subtree of any tree
        if(p == null) return false;
        //travers the p tree to find a node whose val equals the val of q
        //Match the subtree
        if (p.val == q.val&&checkStructure(p,q)){
            return true;}
        //continue checking whether the tree is subtree of left or right
        return checkSubtree(p.left,q)||checkSubtree(p.right,q);
    }
    
    public boolean checkStructure(TreeNode p, TreeNode q) {
        //compare each nodes
        if(p==null&&q==null){
            return true;
        }else if(p==null||q==null){
            return false;
        }
        if (p.val != q.val)
            return false;
        return checkStructure(p.left, q.left) && checkStructure(p.right, q.right);
    }
}
