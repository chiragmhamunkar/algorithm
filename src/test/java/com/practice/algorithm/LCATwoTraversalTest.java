package com.practice.algorithm;

import com.practice.algorithm.model.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LCATwoTraversalTest extends LCATest{
    private LCATwoTraversal lcaTwoTraversal = new LCATwoTraversal();

    @Override
    protected LCA getLca() {
        return lcaTwoTraversal;
    }

    @Test
    public void test_path(){
        BinaryTreeNode[] nodes = createTree(3);
        List<BinaryTreeNode> allNodesInPath = lcaTwoTraversal.getAllNodesInPath(nodes[0], nodes[1]);
        Assert.assertEquals(2, allNodesInPath.size());

    }
}
