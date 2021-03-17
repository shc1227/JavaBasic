package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * 조건문
		 *  - if
		 *  - switch문
		 *  
		 *  -if문     ↓-- 주로 비교 할 때(블린)
		 *  - if(조건식){} : 조건식의 결과가 true이면 블럭안의 문장을 수행한다. <--false면 실행되지 않는다.
		 *  - else if(조건식){} : 다순의 조건이 필요할 떄 if뒤에 추가한다.
		 *  - else{} : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 *
		 */
		
		
//		int a = 1;
//		if(a == 1){
//				System.out.println("조건식의 연산결과가 true이면 수행된다.");
//		}
//			
//		if(a == 0){
//			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
//		}
//		
//		if(a == 1 ){/*모든 조건이 true라고 하더라도 가장 위에 있는 것이 실행된다.*/
//			System.out.println("a가 1인 경우에 하고 싶은 것");
//		}else if(a ==2){
//			System.out.println("a가 2인 경우에 하고 싶은 것");
//		}else if(a ==3){
//			System.out.println("a가 3인 경우에 하고 싶은 것");
//		}else{
//			System.out.println("이외의 경우에 하고 싶은 것");
//		}
//		
//		if(a<10){//<-- else가 붙지 않으면  한세트가 아닌 각각 다른문장으로 2개다 출력되고있다.
//			System.out.println("a가 10보다 작다.");
//		}else if(a<20){
//			System.out.println("a가 20보다 작다.");
//		}
		
		
		int score =  70;
//		//점수가 60점 이상이면 합격 그렇지 않으면 불합격이라고 출력해주세요.
//		
//		if( score >= 60){
//			System.out.println("합격");
//		}else{
//			System.out.println("불합격");
//		}
		
		//점수에 등급을 부여하는 프로그램
		Scanner sc = new Scanner(System.in);
//		score = 80;
//		System.out.print("입력해봐>");
//		score = sc.nextInt();
		String grade = null;
//		/*
//		 * 기본값 : 직접 초기화 하지 않았을 때 초기화 되는 값
//		 * - 참조형 타입 : null
//		 * - boolean : false
//		 * - char : ' '(0)
//		 * - 나머지 : 0
//		 */
//		
//		if(score >= 90){
//			grade = "A";
//		}else if(score >= 80){
//			grade = "B";
//		}else if(score >= 70){
//			grade = "C";
//		}else if(score >= 60){
//			grade = "D";
//		}else{
//			grade = "F";
//		}
//		
//		System.out.println("점수 : "+grade+"등급입니다.");
//		
//		
//	System.out.println("==============================");
//	
//		score = 90;
//		grade = null;
//		
//		if(score >= 90){
//			grade = "A";
//			if(score >= 97){ 
//				grade += "+";
//			}else if(score <= 93){
//				grade += "-";
//			}
//		}else if (score >= 80){
//			grade ="B";
//			if(score >= 87){
//				grade += "+";
//			}else if(score <= 83){
//				grade += "-";
//			}
//		}else if (score >= 70){
//			grade ="C";
//			if(score >= 77){
//				grade += "+";
//			}else if(score <= 73){
//				grade += "-";
//			}
//		}else if (score >= 60){
//			grade ="D";
//			if(score >= 67){
//				grade += "+";
//			}else if(score <= 63){
//				grade += "-";
//			}
//		}else{
//			grade = "F";
//		}
//		System.out.println("점수 : "+grade+"등급입니다.");
//		
//		//정렬: Ctrl + Shift + f(드래그 하여 사용하는 것이 좋다)
//		
		/*
		 * switch문
		 * - switch(int/String){ case 1: break;}
		 * - 조건식의 결과는 정수와 문자열만(jdk1.7부터 문자열 혀용) 허용한다.
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 */
//		
//		a = 10; //int //주의점 -  일치하는 조건문부터 실행이 되는데 break가 없으면 break가 있는것 까지 실행된다.
//		//똑같은 것이 있을 때 if문보다 switch가 조금 더 빠르다.
//		switch(a){
//		case 10:
//			System.out.println("a가 10인 경우에 하고 싶은 것");
//			break;
//		case 20:
//			System.out.println("a가 20인 경우에 하고 싶은 것");
//			break;
//		default:
//			System.out.println("이외의 경우에 하고 싶은 것");
//		}
//		
//		String b = "a";
//		switch(b){
//		case "a":  				// \(역슬러시는 탈출문자) \"->문자열 안에 쌍따옴표를 표현하고 싶을 때
//			System.out.println("b가\"a\"인 경우에 하고 싶은 것");
//			break;
//		case "b":
//			System.out.println("b가\"b\"인 경우에 하고 싶은 것");
//			break;
//		default:
//			System.out.println("이외의 경우에 하고 싶은 것");
//		}
//		
//		//월에 해당하는 계절을 출력
//		int month = 9;
//		String season = null;
//		
//		switch(month){
//		case 3: case 4: case 5:
//			season = "봄";
//			break;
//		case 6: case 7: case 8:
//			season = "여름";
//			break;
//		case 9: case 10: case 11:
//			season = "가을";
//			break;
//		case 12: case 1: case 2:
//			season = "겨울";
//			break;
//		}
//		System.out.println(month +"월의 계절은 "+season+" 입니다.");
//		
//		score = 90;
//		grade = null;
//		
//		switch(score/10){
//			case 9:
//				grade = "A";
//				break;
//			case 8:
//				grade = "B";
//				break;
//			case 7:
//				grade = "C";
//				break;
//			case 6:
//				grade = "D";
//				break;
//			case 5:
//				grade = "F";
//				break;
//		}
//		System.out.println(score + "점수의 등급 :"+grade );
//		
		//숫자를 입력받아 그 숫자가 0인지 아닌지 출력해주세요.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요.> ");
//		int num = Integer.parseInt(sc.nextLine());
//
//		if(num == 0){
//			System.out.println("입력하신 숫자는 0입니다.");
//		}else if(num !=0){
//			System.out.println("입력하신 숫자는 0이 아닙니다.");
//		}
//		
//		
//		
		//숫자를 입력받아 그 숫자가 홀수 인지 짝수 인지 출력하세요:
//		System.out.print("숫자를 입력하세요.> ");
//		num = Integer.parseInt(sc.nextLine());
//		
//		if(num%2 == 0 ){
//			System.out.println("짝수");
//		}else{
//			System.out.println("홀수");
//		}
//		
		//정수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
//		System.out.print("te1 점수를 입력하세요.> ");
//		int te1 = Integer.parseInt(sc.nextLine());
//		System.out.print("te2 점수를 입력하세요.> ");
//		int te2 = Integer.parseInt(sc.nextLine());
//		System.out.print("te3 점수를 입력하세요.> ");
//		int te3 = Integer.parseInt(sc.nextLine());
//		
//		int tot = te1+te2+te3;
//		double avg = Math.round(tot/3.0*100)/100.0;
//		
//		if(avg >=90){
//			System.out.println("평점 :"+tot+" 평균 :"+avg +" A등급");
//		}else if(avg >=80){
//			System.out.println("평점 :"+tot+" 평균 :"+avg +" B등급");
//		}else if(avg >=70){
//			System.out.println("평점 :"+tot+" 평균 :"+avg +" C등급");
//		}else if(avg >=60){
//			System.out.println("평점 :"+tot+" 평균 :"+avg +" D등급");
//		}else {
//			System.out.println("평점 :"+tot+" 평균 :"+avg +" F등급");
//		}
		
		//1~100 사이의 랜덤한 수를 3개를 발생시키고 오름차순으로 출력해주세요.
		double a = Math.round(Math.random()*100)+1;
		double b = Math.round(Math.random()*100)+1;
		double c = Math.round(Math.random()*100)+1;
		double t = 0;
		
		
	//내가 한것	
//		System.out.println("A값 :"+a);		System.out.println("B값 :"+b);		System.out.println("C값 :"+c);
//		if(a>b && a>c && b>c){//a가 가장 클때
//			System.out.println(c+","+b+","+a);
//		}else if(a>b && a>c && c>b){
//			System.out.println(b+","+c+","+a);
//		}else if(b>a && b>c && c>a){//b가 가장 클때 
//			System.out.println(a+","+c+","+b);
//		}else if(b>a && b>c && a>c){
//			System.out.println(c+","+a+","+b);
//		}else if(c>b && c>a && b>a){//b가 가장 클때 
//			System.out.println(a+","+b+","+c);
//		}else if(c>b && c>a && a>b){
//			System.out.println(b+","+a+","+c);
//		}else if(a==b && a>c){//a = b 일때
//			System.out.println(c+","+a+","+b);
//		}else if(a==b && c>a){//a = b 일때
//			System.out.println(b+","+a+","+c);
//		}else if(b==c && a>c){//b = c 일때
//			System.out.println(b+","+c+","+a);
//		}else if(b==c && c>a){//b = c 일때
//			System.out.println(a+","+b+","+c);
//		}else if(a==c && b>c){//a = c 일때
//			System.out.println(a+","+c+","+b);
//		}else if(a==c && c>b){//a = c 일때
//			System.out.println(b+","+a+","+c);
//		}else if(a==b && b==c){
//			System.out.println(b+","+a+","+c);
//		}
		//선생님이 한것
		
		if(a>b){
			t = a;
			a = b;
			b = t;
		}
		if(a>c){
			t = a;
			a = c;
			c = t;
		}
		if(b>c){
			t = b;
			b = c;
			c = t;
		}
		
		System.out.println(a+"<"+b+"<"+c);
		
		
	}
}




















