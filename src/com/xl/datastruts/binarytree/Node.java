package com.xl.datastruts.binarytree;

/**
 * @author 作者:xl
 * @data   创建时间:2017-10-28
 * @description 二叉树节点类
 * @version 1.0
 */

public class Node {
	private int data;
	private Node leftNode;
	private Node rightNode;

	public Node(){}
	public Node(int data, Node leftNode, Node rightNode) {
		super();
		this.data = data;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}
	public Node getRightNode() {
		return rightNode;
	}
	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
}

