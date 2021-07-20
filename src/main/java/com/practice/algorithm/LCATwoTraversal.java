package com.practice.algorithm;

import com.practice.algorithm.model.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LCATwoTraversal implements LCA{

    @Override
    public BinaryTreeNode findLca(BinaryTreeNode root, BinaryTreeNode node1, BinaryTreeNode node2) {
        if(root == null) return null;

        List<BinaryTreeNode> node1List = reverse(getAllNodesInPath(root, node1));
        List<BinaryTreeNode> node2List = reverse(getAllNodesInPath(root, node2));

        BinaryTreeNode ans = null;
        for(int i = 0; i != Math.min(node1List.size(), node2List.size()); ++i){
            if(node1List.get(i) != node2List.get(i)) break;
            ans = node1List.get(i);
        }
        return ans;
    }

    private List<BinaryTreeNode> reverse(List<BinaryTreeNode> list) {
        List<BinaryTreeNode> reversed = new ArrayList<>();
        for(int i = list.size()-1; i != -1; --i)
            reversed.add(list.get(i));
        return reversed;
    }

    protected List<BinaryTreeNode> getAllNodesInPath(BinaryTreeNode root, BinaryTreeNode node) {
        if(root == null) return Collections.emptyList();
        if(root == node) {
            return new ArrayList<BinaryTreeNode>(){{add(root);}};
        }

        List<BinaryTreeNode> leftList = getAllNodesInPath(root.left, node);
        List<BinaryTreeNode> rightList = getAllNodesInPath(root.right, node);
        if(!leftList.isEmpty()){
            leftList.add(root);
            return leftList;
        }

        if(!rightList.isEmpty()){
            rightList.add(root);
            return rightList;
        }

        return Collections.emptyList();
    }
}
