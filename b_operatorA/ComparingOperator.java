package b_operatorA;

public class ComparingOperator {

	public static void main(String[] args) {
	/*
	 * 비교 연산자
	 * - <, >, <=, >=, ==, !=
	 * - 문자열 비교 : equals() 
	 */

	int x = 10;
	int y = 20;
	boolean b = x < y;
	System.out.println(b);
	
	b= x <= y - 15; //산술연산이 우선 수행되고 비교연산이 수행된다.
	
	String str1 = "abc";
	String str2 = "abc";
	b = str1 == str2; //문자열의 내용이 아닌 주소를 비교한 것이다.
	System.out.println(b);
	
	b= str1.equals(str2);//문자열의 내용을 비교한 것이다.
	System.out.println(b);
	
	b= !str1.equals(str2);//문자열의 내용이 같지 않으지를 비교할 때
	System.out.println(b);	
	
	
	//다음의 문장들을 코드로 작성해주세요.
	//1. x는 y보다 작거나 같다.
	b =	x< y;
	//2. x + 5와 y= 같다.
	b = x+5 == y;
	//3. y는 홀수 이다.
	b = y%2 == 1;
	//4. "기본형"과"참조형"은 다르다.
	str1 ="기본형";
	str2 ="참조형";
	b = !str1 .equals(str2);
	
		
		
		
		
		
		
		
		
		
		
	}

}





















