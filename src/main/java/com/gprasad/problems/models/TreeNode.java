package com.gprasad.problems.models;

public class TreeNode {
    public Integer val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(Integer x) { val = x; }

    @Override
    public boolean equals(Object o) {
        if(o == null) {
            return false;
        }
        if (this == o){
            return true;
        }
        if(! (o instanceof TreeNode)) {
            return false;
        }
        TreeNode r = (TreeNode) o;
        boolean valCompare = this.val.equals(r.val);
        if(valCompare) {
            Boolean leftCompare = this.left == null && r.left == null;
            if (this.left != null && r.left != null) {
                leftCompare = this.left.equals(r.left);
            }

            Boolean rightCompare = this.right == null && r.right == null;

            if (this.right != null && r.right != null) {
                rightCompare = this.right.equals(r.right);
            }
            return (leftCompare && rightCompare);
        }
        return false;
    }
}
