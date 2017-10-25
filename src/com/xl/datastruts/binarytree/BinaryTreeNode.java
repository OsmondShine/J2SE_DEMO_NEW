package com.xl.datastruts.binarytree;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-19
 * @description 
 * @version 1.0
 */

public class BinaryTreeNode {
	private Object element;//结点元素 
    private  BinaryTreeNode leftChild;//左子树  
    private  BinaryTreeNode rightChild; //右子树 
 
    /**
     * 无参构造函数
     */ 
    public BinaryTreeNode() { 
    } 
 
    /**
     * 指定结点元素的构造函数
     * @param theElement
     */ 
    public BinaryTreeNode(Object theElement) { 
        element = theElement; 
    } 
 
    /**
     * 指定结点元素，左孩子，右孩子的构造函数
     * @param theElement 结点元素
     * @param theleftChild 左孩子
     * @param therightChild 右孩子
     */ 
    public BinaryTreeNode(Object theElement, BinaryTreeNode theleftChild, 
            BinaryTreeNode therightChild) { 
        element = theElement; 
        leftChild = theleftChild; 
        rightChild = therightChild; 
    } 
 
    /**
     * 获取当前结点大的左孩子
     * @return 当前结点的左孩子
     */ 
    public BinaryTreeNode getLeftChild() { 
        return leftChild; 
    } 
 
    /**
     * 获取当前结点的右孩子
     * @return 当前结点的右孩子
     */ 
    public BinaryTreeNode getRightChild() { 
        return rightChild; 
    } 
 
    /**
     * 获取当前结点的元素
     * @return 当前结点的元素
     */ 
    public Object getElement() { 
        return element; 
    } 
 
    /**
     * 设置当前结点的左孩子
     * @param theLeftChild 当前结点设置后的左孩子
     */ 
    public void setLeftChild(BinaryTreeNode theLeftChild) { 
        leftChild = theLeftChild; 
    } 
 
    /**
     * 设置当前结点 的右孩子
     * @param theRightChild 当前结点设置后的右孩子
     */ 
    public void setRightChild(BinaryTreeNode theRightChild) { 
        rightChild = theRightChild; 
    } 
 
    /**
     * 设置当前结点的元素
     * @param theElement 当前结点设置后的元素
     */ 
    public void setElement(Object theElement) { 
        element = theElement; 
    } 
 
    /**
     * 打印当前结点元素
     */ 
    public String toString() { 
        return element.toString(); 
    } 
}

