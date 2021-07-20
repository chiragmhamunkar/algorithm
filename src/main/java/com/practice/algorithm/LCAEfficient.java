package com.practice.algorithm;

import com.practice.algorithm.model.BinaryTreeNode;

public class LCAEfficient implements LCA{

    @Override
    public BinaryTreeNode findLca(BinaryTreeNode root, BinaryTreeNode node1, BinaryTreeNode node2) {

        if(root == null) return null;

        if(root == node1 || root == node2) return root;

        BinaryTreeNode left = findLca(root.left, node1, node2);
        BinaryTreeNode right = findLca(root.right, node1, node2);

        if(left != null && right != null)
            return root;
        if(left != null && right == null)
            return left;
        if(left == null && right != null)
            return right;
        return null;
    }
}
