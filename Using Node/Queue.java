class QueueNode{
	private int data;
	private QueueNode next;
	
	public QueueNode(int data, QueueNode next){
		this.data = data;
		this.next = next;
	}
	
	public int getData(){
		return data;
	}
	
	public QueueNode getNext(){
		return next;
	}
	
	public void setNext(QueueNode next){
		this.next = next;
	}
}

public class Queue{
	private QueueNode head;
	private QueueNode tail;
	
	public Queue(){
		this.head = null;
		this.tail = null;
	}
	
	public void enqueue(int data){
		QueueNode node = new QueueNode(data, null);
		if(tail != null){
			tail.setNext(node);			
		}
		tail = node;
		
		if(head == null){
			head = node;
			head.setNext(tail);
		}		
	}
	
	public int dequeue() throws Exception{
		if(head == null){
			throw new Exception("Queue is empty.");
		}
		else{
			int data = head.getData();
			head = head.getNext();
			return data;
		}
	}
}