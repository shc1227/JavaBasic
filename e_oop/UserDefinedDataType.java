package e_oop;

public class UserDefinedDataType {

	public static void main(String[] args) {
		/*
		 *  사용자 정의 데이터 타입
		 * - 데이터의 최종 진화 형태이다. (기본형 -> 배열-> 클라스)
		 * - 서로 다른 타입의 데이터를 묶어서 사용하는 것이다.
		 * - 변수와 메서드로 구성할 수 있다.
		 */
		
		// 기본형
		
		int kor; 
		int eng; 
		int sum; 
		int math;
		double avg;
		String name;
		
		//배열
		int[] scores;
		int sum2;
		double avg2;
		String name2;
		
		//클래스
		Student student;//변수를 선언
		student = new Student();//초기화(객체생성/인스턴스화)<-- 클래스를 사용할 준빌를 한것
		
		student.kor = 80;
		student.eng = 60;
		student.math = 85;
		student.sum = student.kor + student.eng + student.math;
		student.avg = student.sum/3.0;
		student.name = "홍길동";
		
		System.out.println(student.name + " / " + student.sum + " / " + student.avg);
		
		
		
		Student student2 = new Student();
		
		student2.kor  = 99;
		student2.eng  = (int)(Math.random()*101);
		student2.math = 56;
		student2.sum = student2.kor + student2.eng + student2.math;
		student2.avg = student2.sum/3.0;
		student2.name ="홍장군";
				
		System.out.println(student2.name + " / " + student2.sum + " / " + student2.avg);
	}
}



class Student{ //class를 만든이유 변수 데이터를 저장하기 위해서
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	String name;
	
	
}


