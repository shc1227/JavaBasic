package b_operatorA;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * 논리 연산자 - 비교연산자를 연결시켜주는 역할
		 * - &&(AND), ||(OR), !(NOT)
		 * - 피연산자로 boolean만 허용한다.
		 * 
		 */

		int x = 10;
		int y = 20; 
		boolean b = 0 < x && x < 10 || x<y; // and 와 or가 있으면 and가 우선순위가 높다.
		
		b =  !( x < y);// --> 비교연산을 한 타입이 boolean이다. 그앞에만 !를 사용 할 수 있다.
		
		//효율적인 연산(주의)
		b = true && true; // true
		b = true && false; // false
		b = false && true; // false
		b = false && false; // false
		
		b = true || true; // true
		b = true || false; // true
		b = false || true; // true
		b = false || false; // false
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		
		/******************************/
		int a = 10;
		b = a< 5 && 0 < a++;
		System.out.println(a); //왼쪽의 결과 정해 졌끼 때문에 오른 쪽은 수행하지 않는다.
		
		
		//다음의 문장들을 코드로 작성해주세요.
		//1. x가 y보다 크고 x가 10보다 작다.
		b = x > y && x < 10;
		//2. x가 짝수이고 y보다 작거나 같다.
		b = x % 2 ==0 && x < y;
		//3. x가 3의 배수이거나 5의 배수이다.
		b = x / 3 ==0 || x / 5 ==0;
		
		
	}

}
