package g_oop2;

public class AccessTest {
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		//System.out.println(am.privateVar);//클래스 내에서 사용가능한것
		//am.privateMethod();
	
	}
	
	
	
	
}
