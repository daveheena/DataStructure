class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data){
		this.data = data;
	}
}

public class BinarySearchTree{
	TreeNode root;
	
	public BinarySearchTree(){
		root = null;
	}
	
	public void insertNode(int data) throws Exception{
		if(root == null){
			root = new TreeNode(data);
		}
		else{
			TreeNode node = root;
			while(true){
				if(node.data > data){
					if(node.left == null){
						node.left = new TreeNode(data);
						break;
					}
					else {
						node = node.left;
					}
				}
				else if(node.data < data){
					if(node.right == null){
						node.right = new TreeNode(data);
						break;
					}
					else{
						node = node.right;
					}
				}
				else{
					throw new Exception("Duplicates are not allowed.");
				}
			}
		}
	}
	
	public void inOrderTreeTraversal(){
		if(root != null){
			printInOrder(root);
		}
	}
	
	private void printInOrder(TreeNode node){
		if(node != null){
			System.out.print(node.data+" ");
			if(node.left != null){
				printInOrder(node.left);
			}
			if(node.right != null){
				printInOrder(node.right);
			}
		}
	}
}