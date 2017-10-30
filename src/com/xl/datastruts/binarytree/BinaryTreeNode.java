package com.xl.datastruts.binarytree;

/**
 * @author 作者:xl
 * @data   创建时间:2017-10-28
 * @description 
 * @version 1.0
 */

public class BinaryTree {
	/*
	 *二叉树的先序中序后序遍历 
	 */
	public Node init(){
		//因为非叶子结点会用到下面的结点，而初始化是顺序进行的，故应逆序建立结点
		Node J = new Node(8, null, null);
		Node H = new Node(4, null, null);  
	    Node G = new Node(2, null, null);
	    Node F = new Node(7, null, J);  
	    Node E = new Node(5, H, null);  
	    Node D = new Node(1, null, G);  
	    Node C = new Node(9, F, null);  
	    Node B = new Node(3, D, E);  
	    Node A = new Node(6, B, C);
	    return A;	//返回根结点
	}
	
	public void printNode(Node node){
		System.out.print(node.getData()+" ");
	}
	
	public void theFirstTraversal(Node root){	//先序遍历
		printNode(root);
		if (root.getLeftNode() != null){	//递归遍历左子树
			theFirstTraversal(root.getLeftNode());
		}
		if (root.getRightNode() != null){	//递归遍历右子树
			theFirstTraversal(root.getRightNode());
		}
	}

	public void theInOrderTraversal(Node root){	//中序遍历
		if (root.getLeftNode() != null){
			theInOrderTraversal(root.getLeftNode());
		}
		printNode(root);
		if (root.getRightNode() != null){
			theInOrderTraversal(root.getRightNode());
		}
	}
	
	public void thePostTraversal(Node root){	//后序遍历
		if (root.getLeftNode() != null){
			thePostTraversal(root.getLeftNode());
		}
		if (root.getRightNode() != null){
			thePostTraversal(root.getRightNode());
		}
		printNode(root);
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Node root = tree.init();
		System.out.println("先序遍历");
		tree.theFirstTraversal(root); 
		System.out.println("");
		System.out.println("中序遍历");
		tree.theInOrderTraversal(root);
		System.out.println("后序遍历");
		tree.thePostTraversal(root);
		}
}

