import javax.swing.tree.TreeNode;
public class BtMaxPathsum {
    class Solution {
    static int ans = 0;
    public int result(TreeNode root){
        if(root==null) return 0;
        int leftsum = Math.max(0 , result(root.left));
        int rightsum = Math.max(0, result(root.right));
        ans = Math.max(ans , root.val+leftsum + rightsum);
        return root.val + Math.max(leftsum , rightsum);

    }
    public int maxPathSum(TreeNode root) {
        
        ans = root.val;
        result(root);
        return ans;
    }
}
}
