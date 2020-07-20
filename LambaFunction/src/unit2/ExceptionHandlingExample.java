package unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int [] someNum = {1,2,3,4};
		int key = 2;
//		process(someNum , key , (v , k) -> {
//			try {
//				System.out.println(v/k);
//			} catch(ArithmeticException ex) {
//				System.out.println("Arithmetic exception has occured!");
//			}
//		});
		process(someNum , key , wrapperLambda((v , k) -> System.out.println(v/k)));
	}

	private static void process(int[] someNum, int key , BiConsumer<Integer, Integer> biConsumer) {
		for(int i : someNum) {
			biConsumer.accept(i, key);
//			try {
//				biConsumer.accept(i, key);
//			} catch(ArithmeticException e) {
//				System.out.println("Exception occured!");
//			}
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer , Integer> biConsumer) {
//		return (v, k) -> System.out.println(v+k);
		return (v , k) -> {
			try {
				biConsumer.accept(v, k);
			} catch(ArithmeticException ex) {
				System.out.println("Exception in wrapper block!");
			}
//			System.out.println("Printing from wrapper..");
//			biConsumer.accept(v, k);
		};
	}

}
