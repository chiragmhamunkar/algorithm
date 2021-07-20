package com.practice.algorithm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LCATest {

    private LCA lca;

    @Before
    public void setUp(){
        this.lca = new LCA();
    }

    @Test
    public void test_lca(){
        LCA.BinaryTreeNode[] nodes = createTree(7);
        LCA.BinaryTreeNode node = lca.findLca(nodes[0], nodes[3], nodes[4]);
        Assert.assertEquals(nodes[1], node);
    }

    @Test
    public void test_lca2(){
        LCA.BinaryTreeNode[] nodes = createTree(7);
        LCA.BinaryTreeNode node = lca.findLca(nodes[0], nodes[1], nodes[4]);
        Assert.assertEquals(nodes[1], node);
    }

    @Test
    public void test_lca3(){
        LCA.BinaryTreeNode[] nodes = createTree(7);
        LCA.BinaryTreeNode node = lca.findLca(nodes[0], nodes[0], nodes[4]);
        Assert.assertEquals(nodes[0], node);
    }

    @Test
    public void test_sameNode(){
        LCA.BinaryTreeNode[] nodes = createTree(7);
        LCA.BinaryTreeNode node = lca.findLca(nodes[0], nodes[1], nodes[1]);
        Assert.assertEquals(nodes[1], node);
    }

    @Test
    public void test_nullRoot(){
        LCA.BinaryTreeNode[] nodes = createTree(7);
        LCA.BinaryTreeNode node = lca.findLca(null, nodes[1], nodes[4]);
        Assert.assertEquals(null, node);
    }

    private LCA.BinaryTreeNode[] createTree(int totalNodes){

        LCA.BinaryTreeNode[] nodes = new LCA.BinaryTreeNode[totalNodes];
        for (int i = totalNodes-1; i != -1; --i) {
            nodes[i] = new LCA.BinaryTreeNode(i);

            if(2*i+1 < totalNodes) nodes[i].left = nodes[2*i+1];
            if(2*i+2 < totalNodes) nodes[i].right = nodes[2*i+2];
        }

        return nodes;
    }
}
