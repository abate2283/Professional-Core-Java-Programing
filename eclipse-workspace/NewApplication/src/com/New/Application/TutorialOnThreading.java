package com.New.Application;

public class TutorialOnThreading {

	public static void main(String[] args) {

		
		Thread t1 = new Thread(() ->

		{
			for (int i = 0; i <= 10; i++) {
				System.out.println("This boy is number: " + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

		
); 
		Thread t2 = new Thread(() -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("This girl is number: " + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

		
);

		t1.start(); // we changed from obj1.start to t1.start.

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t2.start(); // we changed from obj2.start to t2.start.
	}


	
}
