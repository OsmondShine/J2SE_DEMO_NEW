package com.xl.datastruts.binarytree;

import java.lang.reflect.Method;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-19
 * @description 
 * @version 1.0
 */

public interface BinaryTree {
	/**
     * 判断二叉树是否为空
     * @return 二叉树为空则返回true，否则返回false
     */ 
    public boolean isEmpty(); 
 
    /**
     * 返回二叉树的根
     * @return 二叉树的根
     */ 
    public Object root(); 
 
    /**
     * 指定根，左孩子，右孩子创建二叉树
     * @param root 根
     * @param left 做孩子
     * @param right 右孩子
     */ 
    public void makeTree(Object root, Object left, Object right); 
 
    /**
     * 删除二叉树的左子树并返回
     * @return 二叉树的左子树
     */ 
    public BinaryTree removeLeftSubtree(); 
 
    /**
     * 删除二叉树的右子树并返回
     * @return 二叉树的右子树
     */ 
    public BinaryTree removeRightSubtree(); 
 
    /**
     * 使用指定的节点访问方法前序遍历二叉树
     * @param visit 指定的节点访问方法
     */ 
    public void preOrder(Method visit); 
 
    /**
     * 使用指定的节点访问方法中序遍历二叉树
     * @param visit 指定的节点访问方法
     */ 
    public void inOrder(Method visit); 
 
    /**
     * 使用指定的节点访问方法后序遍历二叉树
     * @param visit 指定的节点访问方法
     */ 
    public void postOrder(Method visit); 
 
    /**
     * 使用指定的节点访问方法层序遍历二叉树
     * @param visit 指定的节点访问方法
     */ 
    public void levelOrder(Method visit); 
}

