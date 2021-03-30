package g_oop2;

public class SampleChild extends SampleParent {
	void childMethod(){
		System.out.println(var);
		System.out.println(method(7,13));
	}
	
	//오버라이딩/ super / super() / 다형성
	
	
	
	
	//오버라이딩 : 상속받은 메서드의 내용을 재정의 하는 것
	@Override // 어노테이션 : 클래스, 변수, 메서드 등을 표시해 놓는 것
	int method(int a, int b){
		return a+ b;
	}
	
	
	//super, super()
	int var;
	
	void test(double var){
		System.out.println(var);//지역변수
		System.out.println(this.var);// 인스턴스 변수
		System.out.println(super.var);// 부모 클래스의 인스턴스 변수
		//super : 부모 클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10, 20));//↑에서 생성한 메서드
		System.out.println(super.method(10, 20));//부모에서 생성한 메서드
	}
	
	SampleChild(){
		super();//부모클래스의 생성자 호출
		//super()를 통해서 부모클래스의 생성자를 호출하고 부모클래스의 인스턴스 변수도 초기화한다.
		//super()가 없으면 컴파일러가 자동으로 super()를 넣어 준다. 자동으로 넣지 못할때는 부모의 생성자에 파라미터가 있을때 자동으로 넘겨주지 못한다.직접 생성해야한다 
	}
	
	//다형성 - 부모의 객체를 사용하여 자식의 객체로 이용하는 것
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		SampleParent sp = new SampleChild();//← 부모에서 상속받아 자식으로 사용하는 것
		//SampleChild2
		//SampleChild3
		
		sc = (SampleChild)sp;
		sp = (SampleParent)sc;
		//자식타입 -> 부모타입 형변환은 생략이 가능하다.
		
		sc = (SampleChild)new SampleParent();	//O
		//sc = new SampleParent();				//X
		sp = (SampleParent)new SampleChild();	//O
		sp = new SampleChild();					//O
		
	}
	
}
