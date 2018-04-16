import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		try {
			Stack stack = new Stack();
			
			System.out.println("Select Operation: 1-Push 2-Pop 3-Pip 4-Exit");
			Scanner sc = new Scanner(System.in);
			boolean exit = false;
			while(!exit) {
				int operation = sc.nextInt();
				switch(operation) {
					case 1:
						System.out.println("Enter integer value to add to top of stack:");
						int value = sc.nextInt();
						stack.push(value);
						break;
					
					case 2:
						try {
							int element = stack.pop();
							System.out.println("Top of stack value is:"+element);
						}
						catch(Exception e) {
							System.out.println("Stack is empty.");
						}
						break;
					
					case 3:
						stack.pip();
						break;
					
					case 4:
						exit = true;
						break;
					
					default:
						System.out.println("Invalid operation.");
						exit = true;
						break;
				}
			}
			sc.close();
		}
		catch(Exception e) {
			System.out.println("Error occurred.");
		}
	}

}
