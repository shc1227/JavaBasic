package b_operatorA;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을만들어 주세요.
		
		
		
		Scanner sc = new  Scanner(System.in);
		System.out.print("숫자 입력 :");
		double a = Integer.parseInt(sc.nextLine());
		System.out.print("연산자 입력 :");
		String c = sc.nextLine();
		System.out.print("숫자 입력 :");
		double b = Integer.parseInt(sc.nextLine());
		
		String sum = Double.toString(a + b);
		String sub = Double.toString(a - b);
		String mul = Double.toString(a * b);
		String div = Double.toString(Math.round((a / b)*100.0)/100.0);
		
		
		String res = c.equals("+") ? sum :(c.equals("-") ? sub:
			(c.equals("*") ? mul:(c.equals("/") ? div : "정확히 다시입력해주세요.")));
		System.out.println("==============");
		System.out.println("결과 : " + res);
		
	}

}
