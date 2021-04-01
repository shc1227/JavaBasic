package h_exception;

import java.io.IOException;

public class ThrowException {
	public static void main(String[] args) {
		/*
		 * 예외 발생 시키기
		 * - throw new Exception();
		 * - throw 예약어와 예외 클래스의 객체로 예외를 발생시킬 수 있다.
		 * 
		 */
		
		try {
			throw new IOException("예외가 발생한 이유를 만들자");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		//throw new NullPointerException();
		
//		String str = null;
//		System.out.println(str.equals("문자열비교"));
		
		throw new IndexOutOfBoundsException();//인덱스가 범위를 벗어났다.
		
	}
}
