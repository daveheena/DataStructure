class Node{
	private int data;
	private Node prev;
	
	public Node(int data, Node prev){
		this.data = data;
		this.prev = prev;
	}
	
	public int getData(){
		return data;
	}
	
	public Node getPrev(){
		return prev;
	}
}

public class Stack{
	private Node topOfStack;
	
	public Stack(){
		topOfStack = null;
	}
	
	public void push(int data){
		if(topOfStack == null){
			topOfStack = new Node(data, null);
		}
		else{
			topOfStack = new Node(data, topOfStack);
		}
	}
	
	public int pop() throws Exception{
		if(topOfStack == null){
			throw new Exception("Stack is empty.");
		}
		else{
			int data = topOfStack.getData();
			topOfStack = topOfStack.getPrev();
			return data;
		}
	}
	
	public int peek() throws Exception{
		if(topOfStack == null){
			throw new Exception("Stack is empty.");
		}
		else{
			return topOfStack.getData();
		}
	}
}