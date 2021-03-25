package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * 	객체지향 프로그래밍(Object Oriented Programming)
		 * 	 - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는 것
		 * 	 - 코드의 재상용성이 높고 유지보수가 용이하다.
		 */
		
		Sampleclass sc = new Sampleclass();
		
		System.out.println(sc.field);
		String returnValue =  sc.method1(5);
		System.out.println(returnValue);
		
		sc.method2();
		sc.flowTest1();
		
		
		
		ClassMaker cm = new ClassMaker();
		
		cm.method1();
		System.out.println(cm.method2());
		cm.method3(3);
		System.out.println(cm.mul(10,5));
		
		
		Calculator ca = new Calculator();
		double a1 = ca.add(123456, 654321);
		double a2 = ca.mul(a1, 123456);
		double a3 = ca.div(a2, 123456);
		double a4 = ca.sub(a3, 654321);
		double a5 = ca.rem(a4, 123456);
		
		
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
		
		
		
		
		
		
		
		
		
	}

}
