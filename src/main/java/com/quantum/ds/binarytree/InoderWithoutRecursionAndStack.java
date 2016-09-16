package com.quantum.ds.binarytree;

import java.util.Stack;

import com.quantum.ds.binarytree.BinaryTreeJava.Node;

public class InoderWithoutRecursionAndStack {

	public static void inorderWithoutRecursionAndStack(Node root) {
		Node current, pre;
		if (root == null)
			return;
		current = root;
		while (current != null) {
			if (current.left == null) {
				System.out.print(current.data + " ");
				current = current.right;
			} else {
				pre = current.left;
				while (pre.right != null && pre.right != current)
					pre = pre.right;
				if (pre.right == null) {
					pre.right = current;
					current = current.left;
				} else {
					pre.right = null;
					System.out.print(current.data + " ");
					current = current.right;
				}
			}

		}
	}

	public static void main(String[] args) {
		BinaryTreeJava btj = new BinaryTreeJava();
		btj.add(4);
		btj.add(2);
		btj.add(6);
		btj.add(1);
		btj.add(3);
		btj.add(5);
		btj.add(7);
		Node root = btj.getRoot();
		inorderWithoutRecursionAndStack(root);
	}
}
