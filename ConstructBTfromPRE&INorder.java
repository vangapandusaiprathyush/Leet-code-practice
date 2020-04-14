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
    HashMap<Integer, Integer> m = new HashMap<>();
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0; i<inorder.length; i++)
            m.put(inorder[i],i);
       
        return build(preorder, inorder, 0, inorder.length-1);
    }
    
    public TreeNode build(int[] preorder, int[] inorder, int start, int end){
        if(start > end)
            return null;
        
        TreeNode root = new TreeNode(preorder[preIndex++]);
        
        if(root == null)
            return null;
        
        if(start == end)
            return root;
        
        int index = m.get(root.val);
        
        root.left = build(preorder, inorder, start, index - 1);
        root.right = build(preorder, inorder, index + 1, end);
        
        return root;
    }
}

/*
Time complexity : O(n)  (as we traverse once through both arrays)
Space Complexity : O(n) (for recursion it takes stack memory) 
*/
