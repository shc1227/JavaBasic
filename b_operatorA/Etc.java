package b_operatorA;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		/*
		 * 비트 연산자 ------- 잘 사용되지 않는다.
		 * - |, &, ^, ! ,<<, >>
		 * - 비트 단위로 연산한다.
		 * 
		 * 기타 연산자
		 * 
		 * - .(참조연산자) : 특정 범위 내에 속해있는 멤버를 지칭할 때 사용한다.
		 * - (type) : 형변환
		 * - ?:(삼향연산자) : 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장 *****중요*****
		 * 
		 */

		//1byte : 01010101 (0 또는 1이 8자리에 있는것) 
		System.out.println(10 | 15);//| : 둘다 0인경우 0 그외 1
		//10: 00001010(2진수) 
		//15: 00001111(2진수)
		//	  00001111
		
		
		int x = 10;
		int y = 20;
		int result = x < y ? x : y; 
		System.out.println(result);
		//결과는  앞의 문장과 같다 int result = x;
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1인면 남자 2면 여자
		int regNo = 3;
		String gender =  regNo ==1 ? "남자" : "여자";
		System.out.println("당신의 성별은 " + gender + " 입니다.");
		//이중으로 사용해서 2외에도 3,4,5.. 등이 여자가 되지 않도록했다.
		gender = regNo ==1 ? "남자" : (regNo == 2 ? "여자" : "확인 불가");
		System.out.println("당신의 성별은 " + gender + " 입니다.");

		
		//2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("a를 입력 : ");
		int a = sc.nextInt();
		System.out.print("b를 입력 : ");
		int b = sc.nextInt();
		
		//int res = a> b ? a:(res = a< b ? b: 둘다 가); 
		
		
		int res = a<b? b :a; 
		System.out.println(res);
		
		
		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요.
		//그 외의 숫자를 입력하면 확인 불가를 출력해주세요.
		
		System.out.print("숫자를 입력> ");
		int num = Integer.parseInt(sc.nextLine());
		gender = num ==1 || num==3 ? "남자":(num ==2 ||num ==4? "여자": "확인불가");
		System.out.println(gender);
		
	}

}
