package com.tuean.LeetCode.L600toL699;


import java.util.ArrayList;
import java.util.List;

public class L662 {

    // 每一层找最左边的点和最右边的点 然后找出相差值最大的点
    // 对于每个node 假设其位置是i，他的左节点就是2*i, 右节点就是2*i+1  name只需要找出每层点对应的位置

    public static int widthOfBinaryTree(TreeNode root) {
        return dfs(root, 0, 1, new ArrayList<>(), new ArrayList<>());
    }

    public static int dfs(TreeNode node, Integer level, Integer id, List<Integer> leftList, List<Integer> rightList){
        if(node == null){
            return 0;
        }
        if(leftList.size() <= level){
            // 到了新的一层 初始化
            leftList.add(id);
            rightList.add(id);
        }else{
            // 已有值，直接替换，因为已经找过大的值了
            rightList.set(level, id);
        }
        int currentWith = rightList.get(level) - leftList.get(level) + 1;
        // 从左节点开始往下找 这个点以下的最大值
        int left = dfs(node.left, level + 1, 2*id, leftList, rightList);
        // 从右节点开始往下找 这个点以下的最大值
        int right = dfs(node.right, level + 1, 2*id + 1, leftList, rightList);
        return Math.max(currentWith, Math.max(left, right));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(3);
        TreeNode n1 = new TreeNode(2);
        n1.left = new TreeNode(4);
        node.left = n1;
        System.out.println(widthOfBinaryTree(node));
    }
}
