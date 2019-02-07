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
		printInOrder(root);
	}
	
	private void printInOrder(TreeNode node){
		if(node != null){
			if(node.left != null){
				printInOrder(node.left);
			}
			System.out.print(node.data+" ");			
			if(node.right != null){
				printInOrder(node.right);
			}
		}
	}
	
	public void preOrderTreeTraversal(){
		printPreOrder(root);
	}
	
	private void printPreOrder(TreeNode node){
		if(node != null){
			System.out.print(node.data+" ");
			if(node.left != null){
				printPreOrder(node.left);
			}
			if(node.right != null){
				printPreOrder(node.right);
			}
		}
	}
	
	public void postOrderTreeTraversal(){
		printPostOrder(root);
	}
	
	private void printPostOrder(TreeNode node){
		if(node != null){
			if(node.left != null){
				printPostOrder(node.left);
			}
			if(node.right != null){
				printPostOrder(node.right);
			}
			System.out.print(node.data+" ");
		}
	}
	
	public void levelOrderTreeTraversal(){
		java.util.Queue<TreeNode> queue = new java.util.LinkedList<TreeNode>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			TreeNode node = queue.remove();
			if(node != null){
				System.out.print(node.data+" ");
				
				if(node.left != null){
					queue.add(node.left);
				}
				
				if(node.right != null){
					queue.add(node.right);
				}
			}
		}
	}
}