package g_oop2.test;

import g_oop2.AccessModifier;

public class AccessTest extends AccessModifier {
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		System.out.println(am.publicVar);
		am.publicMethod();
		
//		System.out.println(am.protectedVar);
//		am.protectedMethod();//상속 받은 것을 객체로 사용되고 있어서 작동이 안됨 
		
//		System.out.println(am.defaultVar);
//		am.defaultMethod();
		
		//System.out.println(am.privateVar);//클래스 내에서 사용가능한것
		//am.privateMethod();
		
		AccessTest at = new AccessTest();
		System.out.println(at.protectedVar);
		at.protectedMethod();
	}
	
	
	
	
}
