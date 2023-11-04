package chpt12ex;

import java.util.StringTokenizer;

public class StringTokenEx {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		StringTokenizer tkn = new StringTokenizer(str,",");
		while(tkn.hasMoreTokens()) {
			System.out.println(tkn.nextToken());
		}
	}
}
