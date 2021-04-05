package i_api.test;

import java.util.Arrays;

public class RegularExpression {
	public static void main(String[] args) {
		
	
	/*
	 *  정규표현식 : 문자 열의 패턴을 검사하는 표현식
	 *  ^,$,*,+,[],{},(),|
	 *  
	 *  .,?-앞 문자가 없거나 1개,\s-공백,탭,줄바꿈,\S-공백,탭,줄바꿈아닌
	 *  \w,\W,\d-숫자,\D 숫자가 아닌문자
	 *  (?i)뒷 문자의 대소문자 구분안함
	 */
	
	String str ="12345";
	for(int i=0;i<str.length();i++){
	char charAt = str.charAt(i);
	System.out.print(charAt+" ");
	}
	String rev = "";
	for(int i=str.length()-1;i>=0;i--){
		rev += str.charAt(i);
	}
	System.out.println(rev);	
	
	System.out.println("-----------");
	
	str = "0123456789";
	System.out.println(str.substring(4,9));
	str = "수박 오렌지 귤 블루베리";
	int index = str.indexOf(" ");
	System.out.println(index);
	
	String[] menu = {"수박 20000원","오렌지 100000원","귤 500원","블루베리 3000원"};
	for(int i =0;i<menu.length;i++){
		String name = menu[i].substring(0,menu[i].indexOf(" "));
		System.out.println(name);
		//가격만 잘라서 int타입 변수에 저장해주세요.		
		int price = Integer.parseInt(menu[i].substring(0).substring(menu[i].indexOf(" ")+1,menu[i].indexOf("원")));
		System.out.println(price);
	}
		
	str = "abcd";
	boolean contains = str.contains("c");
	System.out.println(contains);
	for(int i=0;i<menu.length;i++){
		if(menu[i].contains("오렌지")){
			System.out.println("오렌지"+i+"번 인덱스에 있다.");
		}
	}
	
	str = "a b c";
	String[] split = str.split(" ");
	System.out.println(Arrays.toString(split));
	
	
	
	
	}//main 끝
}
