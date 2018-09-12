package com.tuean.LeetCode.L100toL199;

public class L108 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

//    看110 正好反过来
//    生成一个平衡树 每个节点下高度不会差大于1
//    这题没搞懂咋做

//    nums 已经经过排序 把最中间的值放根节点 保障两边的数据量一直或最多差1

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length ==0){
            return null;
        }
        return getTreeNode(nums, 0, nums.length-1);
    }

    private TreeNode getTreeNode(int[] nums, int start, int end){
        if (start > end){
            return null;
        }
        int middle = start + (end-start)/2;
        TreeNode n = new TreeNode(nums[middle]);
        n.left = getTreeNode(nums, start, middle-1);
        n.right = getTreeNode(nums, middle+1, end);
        return n;
    }
}
