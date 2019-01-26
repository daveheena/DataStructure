import java.util.Scanner;

class QueueMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		try{
			Queue queue = new Queue();
			
			boolean loop = true;
			while(loop){
				System.out.println("Enter operation to perform: 1) Enqueue 2) Dequeue 3) Exit");
				switch(sc.nextInt()){
					case 1:
						System.out.println("Enter integer to enqueue:");
						int data = sc.nextInt();
						queue.enqueue(data);
						break;
					
					case 2:
						System.out.println("Dequeue:");
						System.out.println(queue.dequeue());
						break;
						
					case 3:
						loop = false;
						break;
				}
			}			
		}
		catch(Exception e){
			System.out.println("Exception: "+e.getMessage());
		}
		finally{
			sc.close();
		}
	}
}