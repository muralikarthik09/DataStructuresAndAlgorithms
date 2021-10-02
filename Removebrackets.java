package example;

import java.util.Stack;

public class Removebrackets {
	public static void main(String[] args) {
		String s = "9(4(2(3)(1))(6(5)))";
		Node root = conStructBT(s);
		preorder(root);
	}

	static void preorder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data);
		preorder(root.left);
		preorder(root.right);

	}

	static Node conStructBT(String s) {
		Stack<Node> stack = new Stack<Node>();
		Node root = new Node(s.charAt(0) - '0');
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(root);
			} else if (s.charAt(i) == ')') { // Make root the top most element in the stack
				root = stack.peek();
				stack.pop();
			} else {
				if (root.left == null) {
					Node left = new Node(s.charAt(i) - '0');
					root.left = left;
					root = root.left;
				} else if (root.right == null) {
					Node right = new Node(s.charAt(i) - '0');
					root.right = right;
					root = root.right;
				}
			}
		}
		return root;
	}

	static class Node {
		public int data;
		public Node left, right;

		Node(int element) {
			data = element;
			right = left = null;
		}
	}
}
