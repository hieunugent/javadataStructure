/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
    
    TreeNode result, target;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
         this.target = target;
        targetnode(original, cloned);
        return result;
    }
    public void targetnode(final TreeNode original,final TreeNode cloned){
        
        if(original != null){
            targetnode(original.left, cloned.left);
            if(original == target)
            {
                result = cloned;
            }
            targetnode(original.right, cloned.right);   
        }
    }
}