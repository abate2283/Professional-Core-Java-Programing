package multiThreading;

class boys implements  Runnable {
	public void run() {
		
		for(int i = 0; i <=10; i++) {
			
			System.out.println("First Thread boys: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class girls implements Runnable {
	public void run() {
		
		for(int i = 0; i <=10; i++) {
			
			System.out.println("Second Thread, girls: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


public class MultiThreadDemo {

	public static void main(String[] args) {
		
		System.out.println("This is where we start: ");

		Runnable obj1 = new boys();
		Runnable obj2 = new girls();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
		
	}

}
