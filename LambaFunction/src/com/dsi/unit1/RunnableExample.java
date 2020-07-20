package com.dsi.unit1;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running inside main");
				
			}
		});
		myThread.run();
		
		
		//shortcut method
		Thread myLambdaThread = new Thread(() -> System.out.println("Running inside lambda"));
		myLambdaThread.run();

	}

}
