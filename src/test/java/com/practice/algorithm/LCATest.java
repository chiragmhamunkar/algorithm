package com.practice.algorithm;

import com.practice.algorithm.model.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public abstract class LCATest {

    private LCA lca;

    @Before
    public void setUp(){
        this.lca = getLca();
    }

    protected abstract LCA getLca();

    @Test
    public void test_lca(){
        BinaryTreeNode[] nodes = createTree(7);
        BinaryTreeNode node = lca.findLca(nodes[0], nodes[3], nodes[4]);
        Assert.assertEquals(nodes[1], node);
    }

    @Test
    public void test_lca2(){
        BinaryTreeNode[] nodes = createTree(7);
        BinaryTreeNode node = lca.findLca(nodes[0], nodes[1], nodes[4]);
        Assert.assertEquals(nodes[1], node);
    }

    @Test
    public void test_lca3(){
        BinaryTreeNode[] nodes = createTree(7);
        BinaryTreeNode node = lca.findLca(nodes[0], nodes[0], nodes[4]);
        Assert.assertEquals(nodes[0], node);
    }

    @Test
    public void test_sameNode(){
        BinaryTreeNode[] nodes = createTree(7);
        BinaryTreeNode node = lca.findLca(nodes[0], nodes[1], nodes[1]);
        Assert.assertEquals(nodes[1], node);
    }

    @Test
    public void test_nullRoot(){
        BinaryTreeNode[] nodes = createTree(7);
        BinaryTreeNode node = lca.findLca(null, nodes[1], nodes[4]);
        Assert.assertEquals(null, node);
    }

    protected BinaryTreeNode[] createTree(int totalNodes){

        BinaryTreeNode[] nodes = new BinaryTreeNode[totalNodes];
        for (int i = totalNodes-1; i != -1; --i) {
            nodes[i] = new BinaryTreeNode(i);

            if(2*i+1 < totalNodes) nodes[i].left = nodes[2*i+1];
            if(2*i+2 < totalNodes) nodes[i].right = nodes[2*i+2];
        }

        return nodes;
    }
}
