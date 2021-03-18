package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class RandomStudents2 {

	public static void main(String[] args) {
		//(1~25)입력한 숫자만큼 우리반 학생(25명)들 중 랜덤으로 뽑아서 출력하는 프로그램을 만들어주세요.
		
		String[] students = {"최기문","이경준","최윤지","오수연"};
		
		Scanner s = new Scanner(System.in);
		int count = Integer.parseInt(s.nextLine());
		
		String [] pick = new String[count];
		int pickCount = 0;
		do{
			int random = (int)(Math.random()*students.length);
			
			boolean flag = true;
			
			for(int i= 0; i<pick.length;i++){
				if(students[random].equals(pick[i])){
					flag = false;
				}
			}
			
			if(flag){
				pick[pickCount++] = students[random];
			}
			
		}while(pickCount < count);
			System.out.println(Arrays.toString(pick));
		
	}

}
