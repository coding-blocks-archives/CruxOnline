package Webinar.AVLTree;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Feb-2018
 */

public class AVLClient {

	public static void main(String[] args) {

		AVLTree tree = new AVLTree();
		tree.insert(20);
		tree.insert(25);
		tree.insert(30);
		tree.insert(10);
		tree.insert(5);
		tree.insert(15);
		tree.insert(27);
		tree.insert(19);
		tree.insert(16);
		tree.display();

	}

}
