package com.tuean.LeetCode.L500toL599;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class L530 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }

    public int getMinimumDifference(TreeNode root) {
        List<Integer> valueList = new ArrayList<>();
        addList(root, valueList);
        valueList.sort(Comparator.naturalOrder());
        int min = Integer.MAX_VALUE;
        for (int x = 1; valueList.size() > x; x++) {
            min = Math.min(min, Math.abs(valueList.get(x) - valueList.get(x - 1)));
        }
        return min;
    }

    public void addList(TreeNode node, List<Integer> list) {
        if (node == null) return;
        list.add(node.val);
        addList(node.left, list);
        addList(node.right, list);
    }

    int[] sort=new int[10000];
    int index = 0;
    public int getMinimumDifferenceFaster(TreeNode root) {
        TravelBST(root);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<index;i++) {
            min = Math.min(min, Math.abs(sort[i]-sort[i-1]));
        }
        return min;
    }
    public void TravelBST(TreeNode root){
        if(root==null) return;
        TravelBST(root.left);
        sort[index]=root.val;
        index++;
        TravelBST(root.right);
    }

}
