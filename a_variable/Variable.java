package a_variable;//클래스의 위치

import java.util.Scanner;



public class Variable {	//클래스

	public static void main(String[] args) {		
		//내용들 <-- 메서드 특징()소괄호가 있으면 무조건 메서드이다.
		//메서드 : 명령문의 집합 위 메서드의 이름은 main이다.
		//main메서드 : 프로그램의 시작과 끝
		//주석 : 프로그램 코드를 인식하지 않는 문장(주로 코드를 설명한느데 사용한다.)
		//한줄주석 : Ctrl + Shift + c
		// /* */범위주석 :  Ctrl + Shift + /(해제:\)
		
		/*
		 *	데이터의 종류
		 * 	- 정수 : 10, -5
		 * 	- 실수 : 3.14, -1.5
		 * 	- 문자 : 'a', '3'		-> 따옴표(반드시)로 묶여있는 한글자
		 * 	- 논리 : true, false	->참과 거짓을 의미
		 * 
		 * 	프로그래밍에서는 데이터를 사용하기 위해 종류별로 이름을 붙여놓았다.(자료형/Data Type)
		 * 
		 * 	기본형 타입
		 * 	- 정수 : byte(1), short(2), *int(4), long(8)
		 * 	- 실수 : float(4), *double(8)
		 *  - 문자 : char(2)
		 *  - 논리 : boolean(1)
		 *  
		 *  - 변수 : 데이터를 저장하는 공간/ 그릇
		 *
		 */
		
		//변수를 만드는 것 : 변수 선언
		//변수를 만드는 방법 : 데이터타입 변수 이름
		//빨간줄: 컴파일에러(컴파일할 수 없다.실행할 수 없다.)
		int name;
		double pi;
		
		//long name;//한 블럭{}안에서 변수의 이름은 중복될 수 없다.
		//=(대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장
		name = 10; //초기화 : 변수에 처음으로 값을 저장하는 것
		pi = 3.14; //변수의 타입에 맞는 값을 저장해야한다.
		
		int abc = 30;// 보통 선언과 초기화를 동시에 한다.
		long l= 40L; // 접미사L을 붙여야 long타입이 된다.
		float f= 5.5f;//접미사 f를 붙여야 float타입이 된다.
		char c = '한';//따옴표 안에 반드시 한글자만(공백이라도) 넣어야 한다.
		boolean b = true;//true, false
		
		//8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.
		
		
		boolean a1= false;
		char a2 = 'a';
		byte a3 = 5;
		short a4= 150;
		int a5 = 15114;
		long a6 = 151515151L;
		float a7 = 1.1511515F;
		double a8 = 15.151515151;
		
		//실행키: Ctrl + F11
		System.out.println(a3);
	
		a3 = 100;
		
		System.out.println(a3);
		//위에 만든 8개의 변수에 새로운 값을 저장하고 출력해주세요.
		a1= true;
		a2=	'b';
		a3= 77;
		a4= -32768;
		a5= 5930222;
		a6= 63015222L;
		a7= 3.153F;
		a8= 45666.23154151;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		
		/*
		 * 타입 선택의 기준
		 * 
		 * 정수
		 * 	- byte, short : 메모리를 절약해야 할 때
		 * 	- int : 기본
		 *  - long : int의 범위를 벗어날 때
		 *  
		 *  실수
		 *   - float : 메모리르 절약해야 할 때
		 *   - double : 기본
		 *   
		 */
		//문자열 - 쌍따옴표로 묶여 있는 것 -참조형 타입- 참조하는 주소에 값을 저장하여 참조형 주소이다.
		String str = "문자 여러개..";//클래스이다.
		System.out.println(str);
		
		
		
		//형변환
		//다른 타입의 값을 저장하기 위해서는 값의 타입을 변경해 주어야 하는데 이를 형변환(type casting)이라 한다.
		int small = 10;
		long big = 10L;
		
		small = (int)big;
		
		big = small; //왜 생략될수 있나? - 표현범위가 작은 쪽에서 큰쪽으로의 형변환은 생략이 가능하다.<ex)long ->float  >
		
		
		/*
		 * 명명규칙
		 * - 영문자 대소문자, 한글, 숫자, 특수문자('_','$')를 사용 할 수 있다. *한글 사용가능하나 사용하지 말것
		 * - 숫자로 시작할 수 없다.
		 * - 예약어는 사용할 수 없다. 예약어란 이미 어떤 기능으로 사용하는 단어들 (package,class, int,long...등등)
		 * - [낙타식 표기법을 사용한다.(mySampleVariable)] -소문자로 표기하되 새로운 단어가 있으면 앞글자를 2번 이후부터는 대문자로 표시
		 * - [클래스명의 첫글자는 대문자로 한다.(mySampleClass)]- 클래스만 이름을 지을 때는 앞글자가 대문자
		 */
		
		
		/*
		 * 상수
		 * - 처음 담긴 값을 변경 할 수 없는 그릇
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		 */
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
		//MAX_NUMBER = 100;//컴파일 에러
		
		
		System.out.print("줄바꿈을 하지 않는다.");
		System.out.print("줄바꿈을 하지 않는다.\n");// \->escape탈출문자 \n-줄바꿈을 해주는 조합
		System.out.println("줄바꿈을\t합니다.");//\t -> 탭 띄어쓰기역할
		System.out.printf("문자열:%s, 숫자:%d","Hello",10);//출력 포맷을 지정한다. %s->문자열 %d->숫자열
		System.out.println();
		System.out.println("A" + 100);//다른 타입을 문자열로 바꿔버린다.
		System.out.println(10 + 20 + "30");//10+20은 30이 되지만 문자열을 만났기 때문에 3030이 되어버린다.
		System.out.println("10"+20+30);//왼쪽부터 숫자가 시작된다. 때문에102030이된다.
		
		
		//입력
		Scanner sc = new Scanner(System.in);
		//입력받기 위한 클래스 --같은 패키지 안에 Scanner의 패키지를 찾을수 없다.때문에 사용하고싶은 패키지를
		//import해준다. import java.util.Scanner;
		//import단축키 : Ctrl + Shift + o;
		
		//버그 실행
		//System.out.print("숫자를 입력해주세요>");
		//int nextInt = sc.nextInt(); -숫자입력 후 문자를 칠수있게 기다려주지 않는다.
		
		//System.out.print("아무거나 입력해주세요>");
		//문자 입력
		//String str2 = sc.nextLine();//nextLine() - > 문자열을 입력받아주는 메서드이다.->사용자가 입력할 때 까지 기다려주었다가다시 실행하게된다.
		//System.out.println("입력받은 내용: "+ str2);
		
		//정수  입력
		//int nextInt = sc.nextInt();
		//실수 입력
		//double nextDouble = sc.nextDouble();
		//정수 실수는 버그로 인해 사용하지 않는 것을 권장한다. ex)숫자를 받고 문자 입력시 문자값이 무시되는 버그가 있다.
		
		
		//버그해결
//		System.out.println("int 입력>");
//		//int number = (int)sc.nextLine();-->사용불가
//		int number = Integer.parseInt(sc.nextLine());//숫자를 입력 받고 싶을 떄************
//		System.out.println(number);
//		
//		double number2= Double.parseDouble(sc.nextLine());//더블을 하고 싶을 때**
		
		
		
//		//자신의 이름을 저장할 변수를 선언해주세요.
//		String myName;
//		//위에서 선언한 변수를 초기화 하기 위해 이름을 입력받아주세요.
//		System.out.print("이름 입력:");
//		myName =sc.nextLine();
//		
//		//자신의 나이를 저장할 변수를 선언해주세요
//		int age;
//		
//		//위에서 선언한 변수를 초기화 하기 위해 나이를 입력받아주세요.
//		System.out.print("나이 입력:");
//		age = Integer.parseInt(sc.nextLine());
//		
//		//입력받은 이름과 나이 출력
//		System.out.print("이름:"+myName+"  /  ");
//		System.out.printf("나이:%s",age+"세");
		
		//과제
		//다음과 같은 프로그램을 작성해주세요.
		/*
		 * =============회원가입=============
		 * 아이디>admin
		 * 비밀번호(4자리숫자)>1234
		 * 이름>홍길동
		 * 나이>30
		 * 키>185.5
		 * ================================
		 * 회원가입 완료
		 * ================================
		 * 아이디 : admin
		 * 비밀번호: 1234
		 * 이름 : 홍길동
		 * 나이 : 30세
		 * 키: 185.5cm
		 */
		System.out.println("=============회원가입=============");
		System.out.print("아이디 입력 :");
		String id1 = sc.nextLine();
		System.out.print("비밀번호 입력 (4자리숫자):");
		int pw1 = Integer.parseInt(sc.nextLine());
		System.out.print("이름 입력 :");
		String name1 = sc.nextLine();
		System.out.print("나이 입력 :");
		int age1 = Integer.parseInt(sc.nextLine());
		System.out.print("키 입력 :");
		float height1 = Float.valueOf(sc.nextLine());
		System.out.println("================================");
		System.out.println("회원가입 완료");
		System.out.println("================================");
		System.out.println("아이디 : "+id1);
		System.out.println("비밀번호 : "+pw1);
		System.out.println("이름 : "+name1);
		System.out.println("나이 : "+age1+"세");
		System.out.println("키 : "+height1+"cm");
		
		
	}
		
	
}
