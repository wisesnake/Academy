package exandpersonal;

import java.util.Scanner;

public class OneLineInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String str[] = input.split(" ");

	
		for(String i : str) {
			System.out.println(i);
		}
	}
}
