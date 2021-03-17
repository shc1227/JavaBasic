package b_operatorA;

import java.util.Scanner;

public class SimpleCalcluator2 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		System.out.print("첫번째 숫자 입력 >");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("연산자>");
		String op = sc.nextLine();
		System.out.print("두번째 숫자 입력 >");
		int y = Integer.parseInt(sc.nextLine());
		
		
		int result = op.equals("+")? x+y
					: op.equals("-")? x-y
					: op.equals("*")? x*y		
					: op.equals("/")? x/y
					: x %y ;
		System.out.println(x + " "+ op+ " " + y+ "=" + result);
 	}	
	

}
