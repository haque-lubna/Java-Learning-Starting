package com.dsi.unit1;

public class TypeInterfaceExample {

	public static void main(String[] args) {
//		StringLength lambdaLength = (String s) -> s.length();
//		StringLength lambdaLength = (s) -> s.length();
//		StringLength lambdaLength = s -> s.length();
//		System.out.println(lambdaLength.getLength("Lubna"));
		
		printLength(s -> s.length());

	}
	public static void printLength(StringLength stringLength) {
		System.out.println(stringLength.getLength("Lubna"));
	}
	
	interface StringLength{
		int getLength(String s);
	}

}
