package basic;

import java.util.Scanner;

public class SocialNum1 {

	public static void main(String[] args) {
		String gender = "",year = "";
		boolean breakpoint = true;
		int firstNum = 0;



		do {
		    Scanner sc = new Scanner(System.in);
		    
		    System.out.println("주민번호를 양식에 맞게 입력하시기 바랍니다. 양식 : 생년월일 6글자 - 보장번호 7글자");
		    String input = sc.nextLine();
		    
		    firstNum = Integer.parseInt(input.substring(0,1)); // 앞자리 유효성 검사를 위해 입력받은 문자열의 첫부분을 Int형태로 추출하여 저장
		    if (input.length() == 14 && input.charAt(6) == '-') {

		        if (firstNum != 0) { // 앞자리가 0이 아닐경우
		            year = "99년 이전";
		            if (input.charAt(7) == '1') {
		                gender = "남성";
		                breakpoint = false;
		            }
		            else if (input.charAt(7) == '2') {
		                gender = "여성";
		                breakpoint = false;
		            } else {
		                System.out.printf("오류 : 90년대 생의 뒷자리는 1,2로 시작해야 합니다.");
		            }
		        } else if (firstNum == 0){
		            year = "00년 이후";
		            if (input.charAt(7) == '3') {
		                gender = "남성";
		                breakpoint = false;
		            }
		            else if (input.charAt(7) == '4') {
		                gender = "여성";
		                breakpoint = false;
		            } else {
		                System.out.printf("오류 : 00년대 생의 뒷자리는 3,4로 시작해야 합니다.");
		            }
		        }
		        System.out.printf("조회 결과 \n주민번호 : %s \n성별     : %s \n출생연도 : %s입니다.",input,gender,year);
		        
		    } else {
		    	System.out.println("오류!");
		    	
		    }
		    

		    
		}while(breakpoint);

	}

}
