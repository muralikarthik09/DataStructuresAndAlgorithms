package example;

public class Solution {
	public static int solution(Tree tree) {
		Node root = tree.root;
		// write your code in Java SE 8
		if (root == null)
			return 0;
		Result res = new Result();
		longConsNumber(root, 0, root.data, res);
		return res.count;
	}

	public static void longConsNumber(Node root, int currentLenth, int exp, Result res) {
		if (root == null)
			return;

		if (root.data == exp)
			currentLenth++;
		else
			currentLenth = 1;
		res.count = Math.max(res.count, currentLenth);
		longConsNumber(root.left, currentLenth, root.data + 1, res);
		longConsNumber(root.right, currentLenth, root.data + 1, res);
	}

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(2);
		tree.root.right = new Node(2);
		tree.root.right.right = new Node(1);
		tree.root.right.left = new Node(4);

		System.out.println("Longest distinct path" + solution(tree));

	}

	static class Tree {
		Node root;

	}

	static class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	static class Result {
		int count;
	}

}
