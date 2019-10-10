package Lecture12;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false false
		BinaryTree tree = new BinaryTree();
		tree.display();

		System.out.println("Height of tree is " + tree.height());
		tree.preOrder();
		tree.postOrder();
		tree.inOrder();
		tree.levelOrder();
		
        System.out.println(tree.isBST());
		System.out.println(tree.sumLeaf());
	}

}
