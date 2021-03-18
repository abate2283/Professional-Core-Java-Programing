package com.Alfred.Threading;


public class Thread {

	public static void main(String[] args) {
		
		System.out.println("First Task, Working on multi layer projects called Thread.");
		
		Task taskRunner = new Task();
		taskRunner.run();
	
		
	}

}


class Task extends Thread{
	public void run() {
		
		for(int i= 0; i <= 10; i++) {
			System.out.println("This is your second task: " + i);
		}
	}
	
}