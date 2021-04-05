package i_api;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

import e_oop.ScanUtil;

public class SetComma {

	public static void main(String[] args) {
		//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.
		//1,234,567
		System.out.print("숫자입력>");
		String input = ScanUtil.nextLine();
		String[]res = new String[(input.length()/3)+1];	
			int j=1;
			for(int i=(input.length()/3);i>0;i--){
				res[j]=input.substring(input.length()-3*(i),input.length()-3*(i-1));
				j = j+1;
			}
			res[0] = input.substring(0,(input.length()%3));
			
			System.out.println();
//			System.out.println(res.length);
//		System.out.println(Arrays.toString(res));
		
		
		if(res[0].equals("")){
			
		for(int i=1;i<res.length;i++){
			if(i != 1){
			System.out.print(",");
			}
		System.out.print(res[i]);
			}
		}else {
			System.out.print(res[0]);
			for(int i=1;i<res.length;i++){
			System.out.print(",");
			System.out.print(res[i]);
			}
		}
		
		
	}	
}
