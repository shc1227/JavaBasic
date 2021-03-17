package b_operatorA;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * 산술연산자
		 * 	- 사칙연산 : +,-,*,/,%(나머지)
		 * 	- 복합연산 : +=, -=, *=, /=, %=
		 * 	- 증감연산 : ++, -- 
		 */
		
		int result = 10 +20 - 30 * 40 /50 %60;
		//나머지 연산
		result = 10 / 3;
		System.out.println(result);
		result = 10 % 3;
		System.out.println(result);
		
		
		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 출력해주세요.
		int a = 1+1;
		System.out.println(a);
		int b = 2-1;
		System.out.println(b);
		int c = 10*10;
		System.out.println(c);
		int d = 100/20;
		System.out.println(d);
		int e = 15%4;
		System.out.println(e);
		
		//복합연산자
		result = result + 3;
		result += 3;
		
		result -= 5;
		
		result *=2;
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		//result = result + 10;
			result +=10;
		//result = result % 5;
			result %=5;
		//result = result - 2 * 3;
			result -=2*3;
			
		//증감연산자
		//증가연산자(++) : 변수의 값을 1증가시킨다.
		//감소연산자(--) : 변수의 값을 1감소시킨다.
		int i = 0;
		
		++i;//전위형 : 변수의 읽어오기 전에 1 증가된다.
		i++;//후위형 : 변수의 값을 읽어 온 후에 1 증가된다.
		--i;
		i--;
		
		i=0;
		System.out.println("++i = "+ ++i);
		i=0;
		System.out.println("i++ = "+ i++);
		System.out.println(i);
		
		//피연산자의 타입이 서로 같아야 연산이 가능하다.
		
		int _int = 10;
		double _double =3.14;
		double result2= (double)_int +_double;//현재 자동으로 형변환 되고 있다. double로 형변환 되고 있다.
		System.out.println(result2);
		
		long _long = 100L;
		_long = _int + _long;
		System.out.println(_long);
		_int = _int +(int)_long;//int로 하고 싶을때;
		
		byte _byte = 5;
		short _short = 10;
		_int = _byte +_short;//int보다 작은 타입은 int로 형변환된다. 이유는 연산의최소단위가 4바이트이기 때문이다.
		
		char _char = 'a';
		char _char2 = 'b';
		_int = _char + _char2;
		System.out.println(_int);
		
		//오버플로우(가장 큼 값을 벗어난는경우 가장작은값으로 돌아간다.), 언더플로우(가장 작은 값을 벗어난는경우 가장 큰값으로 돌아간다.)
		//표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		byte by = 127;
		by++;
		System.out.println(by);
		by--;
		System.out.println(by);
		
		//00000000 -->1byte 맨앞자리는 +/- 를 표현  --> -128 ~ 127 (-2^7 ~2^7-1)
		// short : -2^15 ~ 2^15-1
		// int: -2^31 ~ 2^31-1
		// long: -2^63 ~ 2^63-1
		// char : -가 필요 없다. 0~2^16 까지 표현
		
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		long q = 123456 + 654321;
	
		q*= 123456;
		q/= 123456;
		q-= 654321;
		q%= 123456;
		
		System.out.println(q);
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 출력해주세요.
		int t1 =99 ;
		int t2 =88 ;
		int t3 =78 ;
		int sum= t1 + t2 + t3;
		double avg1= sum/3.0;
		
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : "+avg1);
		
		//반올림
		avg1 = Math.round(avg1*1000)/1000.0;
		System.out.println(avg1);
		
		
		//랜덤
		//Math.random() : 0.0 ~ 1.0미만(0.9999...)
		int random = (int)(Math.random() * 100)+1;
		System.out.println(random);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
