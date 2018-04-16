import java.util.ArrayList;

public class Stack {
	private ArrayList<Integer> list = new ArrayList<Integer>();
	private int topOfStack = -1;
	public void push(int element) {
		list.add(element);
		topOfStack++;
	}
	
	public int pop() throws Exception {
		if(topOfStack != -1) {
			int element = list.get(topOfStack);
			list.remove(topOfStack);
			topOfStack--;		
			return element;
		}
		else {
			throw new Exception("Stack is empty.");
		}
	}
	
	public void pip() {
		if(list.size()==0) {
			System.out.println("Stack is empty.");
		}			
		else {
			System.out.println("Stack elements:");
			for(int i=list.size()-1;i>=0;i--) {
				System.out.print(list.get(i)+" ");
			}
		}		
	}
	
}
