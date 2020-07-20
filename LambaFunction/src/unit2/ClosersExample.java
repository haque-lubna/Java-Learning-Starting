package unit2;

public class ClosersExample {

	public static void main(String[] args) {
		int a = 10;
		int b =20;
		doProcess(a, i -> System.out.println(b + i));
//		doProcess(a, new Process() {
//			@Override
//			public void process(int i) {
//				System.out.println(b + i);
//				
//			}
//			
//		});
	}
	
	public static void doProcess(int a, Process p) {
		p.process(a);
	}

}

interface Process{
	void process(int a);
}
