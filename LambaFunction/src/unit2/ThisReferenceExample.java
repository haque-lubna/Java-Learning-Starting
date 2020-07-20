package unit2;

public class ThisReferenceExample {
	public void doProcess(int i , Process p) {
		p.process(i);
	}
	public void execute() {
		doProcess(10, a -> {
			System.out.println("The value of a is : " + a);
			System.out.println(this);
		});
	}
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		//method 1
//		thisReferenceExample.doProcess(10, new Process() {
//
//			@Override
//			public void process(int a) {
//				System.out.println("The value of i is: " + a);
//				System.out.println(this);
//				
//			}
//			public String toString() {
//				return "This reference";
//			}
//			
//		});
		
		//method 2
//		thisReferenceExample.doProcess(10, a -> {
//			System.out.println("The value of a is: " + a);
//			System.out.println(this);
//		});
		
		//method 3
		thisReferenceExample.execute();
		
	}
	public String toString() {
		return "This reference";
	}
}
