package g_oop2;

public abstract class SampleAbstractParent {
	//추상메서드(내용이 없는 메서드)와 추상클래스(부모클래스의 역할만 한다.)
	
	void method(){
		
	}
	
	abstract void abstractMethod();
	
}








class SampleAbstractChild extends SampleAbstractParent{

	@Override
	void abstractMethod() {
		
	}

	
}

