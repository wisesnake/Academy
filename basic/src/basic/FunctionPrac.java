package basic;

import java.util.Scanner;

public class FunctionPrac {
	
	static String practice1(String gift) {
		System.out.println(gift+"를 받았습니다.");
		return "담배";
	}
	

	public static void main(String[] args) {
		String func1;
		func1 = practice1("marshmellow ");
		System.out.println(func1 + "를 대가로 주었습니다.");

	}

}
