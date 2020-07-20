package com.dsi.unit1;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	public static void main(String[] args) {
		Greeter greeterObj = new Greeter();
		
//		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		//using lambda function
		Greeting lambdaGreeting = () -> System.out.println("Hello World");
		
//		greeterObj.greet(helloWorldGreeting);
		
		//create annonymous class
		Greeting innerClassGrteeting = new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("Hello World!");
				
			}
		};
//		helloWorldGreeting.perform();
		lambdaGreeting.perform();
		innerClassGrteeting.perform();
//		MyLambda myLambdaFunction = () -> System.out.println("Hello World");
//	    MyAdd myAdd = (int a , int b) -> a+b;
	}
	
//	interface MyLambda {
//		void foo();
//	}
//	
//	interface MyAdd{
//		int add(int a, int b);
//	}

}
