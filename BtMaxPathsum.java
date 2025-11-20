import java.util.*;
public class BtMaxPathsum {
    class Solution {
        public class Node {

        public int val;
        public Node left;
        public Node right;

    }
    static int ans = 0;
    public int result(Node root){
        if(root==null) return 0;
        int leftsum = Math.max(0 , result(root.left));
        int rightsum = Math.max(0, result(root.right));
        ans = Math.max(ans , root.val+leftsum + rightsum);
        return root.val + Math.max(leftsum , rightsum);

    }
    public int maxPathSum(Node root) {
        
        ans = root.val;
        result(root);
        return ans;
    }
}
}
