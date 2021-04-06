package J_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {
	public static void main(String[] args) {
		/*
		 *  Collections Framework
		 *  - 다수의 데이터를 다루기 위한 표준 방식
		 *  - List
		 *  - Map
		 *  - Set
		 *  
		 *  ArrayList의 주요 메서드 --저장한 만큼길이가 늘어 난다.
		 *  - boolean add(Object obj) : 마지막 위치에 객체를 추가후 성공여부를 반환한다.
		 *  - void(int index,Object obj) : 지정된 위치에 객체를 추가한다.
		 *  - Object set(int index,Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.밀어쓰기
		 *  - Object get(int index) : 지정된 위치의 객체를 반환한다. 덮어쓰기
		 *  - int size() : 저장된 객체의 수를 반환한다.
		 *  - Object remove(int index) : 지정된 객체를 제거한다.제건된후 뒤에있던 갚들이 앞으로 온다.		 *  
		 */
		
		ArrayList sample = new ArrayList();
	
		sample.add("adb");
		sample.add(100);//ArrayList는 아무 타입이나 저장이 가능하다. 하지만 꺼낼때 예측이 불가능
		sample.add(new Scanner(System.in));
		//<Integer> 제네릭으로 타입을 지정함
		ArrayList<Integer> list = new ArrayList<>();
		list.add(new Integer(10));
		//list.add("abc");//현재 int만 지정했기때문에 컴파일 에러
		list.add(20);//객체만 저장할수있다.
		/*
		 *  래퍼 클래스
		 *  - byte	: Byte
		 * 	- short : Short
		 *  - int	: Integer
		 *  - long	: Long
		 *  - float : Float
		 *  - double: Double
		 *  - boolean : Boolean
		 *  - char	: Character
		 *  
		 */
		
		 System.out.println(list);
		 
		 list.add(1,30);//저장하고 싶은 인덱스 위치에 30을 저장 그자리에 있던 수는 뒤로 밀리게 된다. 
		 System.out.println(list);
		 
		 int before = list.set(2, 40);//return 값이 있기때문에 기존에 있던 20을 리턴해준다.
		 System.out.println("before :" + before);
		 System.out.println("after :" + list.get(2));
		 System.out.println(list);
		 
		 for(int i=0;i<list.size();i++){
			 System.out.println(i+" : "+list.get(i));
		 }
		 list.remove(1);
		 System.out.println(list);
		 
		 
		 for(int i =list.size()-1; i>=0;i--){//거꾸로 돌려야 모두 제거가 된다.
			 list.remove(i);
		 }
		 System.out.println(list);
		 
		 
		 //list에 1~100사이의 랜덤값을 10개 저장해주세요.
		 for(int i=0;i<10;i++){
			 int random = (int)(Math.random()*100)+1;
			 list.add(random);
		 }
		 System.out.println(list);
		 //list에 저장된 값의 합계와 평균을 구해주세요.
		 
		 int sum=0;
		 for(int i =list.size()-1;i>=0;i--){
			 sum= sum+list.get(i);
		 }
		 double avg=Math.round( sum*100/list.size())/100.0;
		 System.out.println(sum);
		 System.out.println(avg);
		 
		 //최소값과 최대값을 구해주세요.
		int min = list.get(0);
		int max = list.get(0);
		for(int i=0;i<list.size();i++){
			if(list.get(i)<min){
				min = list.get(i);
			}
			if(max<list.get(i)){
				max = list.get(i);
			}
			
		}
		 System.out.println("min :"+min+" /max :"+max);
		 
		 
		 for(int i=0;i<list.size()-1;i++){
			 min=i;
			 for(int j=i+1;j<list.size();j++){
			
				 if(list.get(j)<list.get(min)){
					 min=j;
				 }
			 }
			 	int temp = list.get(i);
			 	list.set(i,list.get(min));
			 	list.set(min, temp);
			 	
		 }
		 System.out.println("list"+list);
		 
		 
		 //2차원
		 ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		 
		 ArrayList<Integer> list3 = new ArrayList<>();
		 list3.add(10);
		 list3.add(20);
		 list3.add(30);
		 
		 
		 list2.add(list3);//ArrayList<>();저장
		 
		 list3 = new ArrayList<>();
		 
		 list3.add(40);
		 list3.add(50);
		 list3.add(60);
		 
		 list2.add(list3);
				System.out.println(list2.size()); 
		 for(int i =0;i<list2.size();i++){
//			 ArrayList<Integer> list4 = list2.get(i);
//			 for(int j=0;j<list4.size();j++){
//				 System.out.print(list4.get(j)+"\t"); 
//			 }
//			 System.out.println();
			 for(int j=0;j<list2.get(i).size();j++){
				 System.out.println(list2.get(i).get(j));
			 }
			 
		 }
		 
		 
				 
		 
	}//메인
}

