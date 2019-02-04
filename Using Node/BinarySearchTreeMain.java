/**
*			50
*		30		100
*	10		40		200
*
*	In Order Traversal: 50 30 10 40 100 200
*/

class BinarySearchTreeMain{
	public static void main(String[] args){
		try{
			BinarySearchTree tree = new BinarySearchTree();
			tree.insertNode(50);
			tree.insertNode(30);
			tree.insertNode(100);
			tree.insertNode(200);
			tree.insertNode(10);
			tree.insertNode(40);
			
			tree.inOrderTreeTraversal();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}