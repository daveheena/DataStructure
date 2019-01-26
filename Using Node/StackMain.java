public class StackMain{
	public static void main(String[] args){
		try{
			Stack stack = new Stack();
			System.out.println("Push: "+1);
			stack.push(1);
			System.out.println("Pop:");
			System.out.println(stack.pop());
			System.out.println("Push: "+2);
			stack.push(2);
			System.out.println("Pop:");
			System.out.println(stack.pop());
			System.out.println("Push: "+3);
			stack.push(3);
			System.out.println("Push: "+4);
			stack.push(4);
			System.out.println("Push: "+5);
			stack.push(5);
			System.out.println("Peek:");
			System.out.println(stack.peek());
			System.out.println("Pop:");
			System.out.println(stack.pop());
			System.out.println("Pop:");
			System.out.println(stack.pop());
			System.out.println("Peek:");
			System.out.println(stack.peek());
			System.out.println("Pop:");
			System.out.println(stack.pop());
			System.out.println("Pop:");
			System.out.println(stack.pop());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}