package J_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * 메서드
		 * Object put(Object key, Object value)	: 지정된 키와 값을 저장한다.
		 * Object remove(Object key) : 지정된 키로 저장된 값을 제거한다.
		 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
		 * Set keySet()	: 저장된 모든 키를 Set으로 반환한다. --어떤 키가 저장된어있는지 알기위해 사용
		 * 
		 * 
		 * --인덱스가 없음 순서가 없이 저장됨
		 * 
		 *캐쉬맵하나로 sql 컬럼 한줄 저장가능
		 *캐쉬맵하나씩 저장후 ArraysList에 저장해서 테이블처럼 사용
		 *
		 */
		//키는 String 타입, 값은 지정하고싶은 타입으로 저장가능
//		HashMap<String, Object> map = new HashMap<>();
//		
//		map.put("name", "홍길동");
//		map.put("date", new Date());
//		map.put("age",10);
//		
//		
//		map.put("date", new Date());
//		
//		System.out.println(map);//저장한 순서로 출력되지는 않는다.
//		System.out.println("1----");
//		map.put("name", "이순신");
//		
//		System.out.println(map);
//		System.out.println("2----");
//		map.remove("age");
//		System.out.println(map);
//		System.out.println("3----");
//		
//		Object value = map.get("name");
//		System.out.println(value);//현재 object 타입으로 꺼내졌다.
//		
//		String str = (String)map.get("name");
//		System.out.println(str);//String 타입으로 꺼내기 위해서는
//		
//		System.out.println("4----");
//		
////		Set<String> keys =  map.keySet();  //set은 중복된 값을 허용하지 않는다.값을 하나씩 꺼낼수 있는 메서드 없다.
////		System.out.println(keys);
////		
////		
////		for(String key : keys){//향상된 for문
////			System.out.println(key+" : "+map.get(key));
////		}
//		
//		
//		
//		HashMap<String, Object> row = new HashMap<>();
//		row.put("id", "admin");
//		row.put("password", "admin123");
//		row.put("name", "관리자");
//		row.put("tel", "010-1234-5678");
//		
//		
//		
//		ArrayList<HashMap<String, Object>> table = new ArrayList<>();
//		table.add(row);
//		
//		System.out.println(table);
//		
//		//table에 회원 1명의 데이터를 추가해주세요.
////		row = new HashMap<>();
//		row.put("id", "admin2");
//		row.put("password", "admin456");
//		row.put("name", "영업부");
//		row.put("tel", "010-4567-8910");
//		
//		table.add(row);
//		
//		System.out.println(table);
		
		//Lprod
		
		
		HashMap<String , Object> lprod_v = new HashMap<>();
		ArrayList<HashMap<String, Object>> lprod_t = new ArrayList<>();
		lprod_v.put("lprod_id", "1");
		lprod_v.put("lprod_gu", "p101");
		lprod_v.put("lprod_nm", "컴퓨터제품");
		lprod_t.add(lprod_v);
		
		lprod_v = new HashMap<>();
		lprod_v.put("lprod_id", "2");
		lprod_v.put("lprod_gu", "p102");
		lprod_v.put("lprod_nm", "전자제품");
		lprod_t.add(lprod_v);
		
		lprod_v = new HashMap<>();
		lprod_v.put("lprod_id", "3");
		lprod_v.put("lprod_gu", "p201");
		lprod_v.put("lprod_nm", "여성캐주얼");
		lprod_t.add(lprod_v);
		
		lprod_v = new HashMap<>();
		lprod_v.put("lprod_id", "4");
		lprod_v.put("lprod_gu", "p202");
		lprod_v.put("lprod_nm", "남성캐주얼");
		lprod_t.add(lprod_v);
		
		lprod_v = new HashMap<>();
		lprod_v.put("lprod_id", "5");
		lprod_v.put("lprod_gu", "p301");
		lprod_v.put("lprod_nm", "피혁잡화");
		lprod_t.add(lprod_v);
		
		
		System.out.println("LPROD_ID\tLPROD_GU\tLPROD_NM");
		
		for(int i=0;i<lprod_t.size();i++){
			HashMap<String, Object> res = lprod_t.get(i);
			System.out.println(res.get("lprod_id")+"\t\t"+res.get("lprod_gu")+"\t\t"+res.get("lprod_nm"));
		
		
		}
	
		System.out.println();
		
		
		
	}//main
}
