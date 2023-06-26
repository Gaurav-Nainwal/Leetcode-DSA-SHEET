/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int count=0;
        int ksmall=-1;
        TreeNode curr=root;
        while(curr!=null){
            if(curr.left==null){
                count++;
                if(count==k){
                    ksmall=curr.val;
                }
                curr=curr.right;
            }
            else{
                TreeNode pre=curr.left;
                while(pre.right!=null && pre.right!=curr){
                    pre=pre.right;
                }
                if(pre.right==null){
                    pre.right=curr;
                    curr=curr.left;
                }
                else{
                    pre.right=null;
                    count++;
                    if(count==k){
                        ksmall=curr.val;
                    }
                    curr=curr.right;
                }
            }
        }
        return ksmall;
    }
    
}
