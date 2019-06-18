package com.tuean.LeetCode.L600toL699;

public class L606 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public String tree2str(TreeNode t) {
        if (t == null) return "";

        String result = t.val + "";

        String left = tree2str(t.left);
        String right = tree2str(t.right);

        if ("".equals(left) && "".equals(right)) {
            return result;
        }
        if ("".equals(left)) {
            return result + "()" + "(" + right + ")";
        }
        if ("".equals(right)) {
            return result + "(" + left + ")" + "()";
        }
        return result + "(" + left + ")" + "(" + right + ")";
    }



    public String tree2strDFS(TreeNode t) {
        // dfs
        StringBuilder sb = new StringBuilder();
        dfs(t, sb);
        return sb.toString();
    }

    private void dfs(TreeNode root, StringBuilder sb) {
        if (root == null) {
            return;
        }

        sb.append(root.val);
        if (root.left == null && root.right == null) {
            return;
        }
        sb.append("(");
        dfs(root.left, sb);
        sb.append(")");
        if (root.right != null) {
            sb.append("(");
            dfs(root.right, sb);
            sb.append(")");
        }
    }

}
