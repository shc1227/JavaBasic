package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class RandomStudents {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//(1~25)입력한 숫자만큼 우리반 학생(25명)들 중 랜덤으로 뽑아서 출력하는 프로그램을 만들어주세요.
		
		int student[] = new int[25];
		
		
		for(int i=0;i< student.length;i++){
			student[i] = i +1;
		}
		System.out.println(Arrays.toString(student));
		int random;		
		int choice;
		int a[];
		System.out.print("뽑을 인원(1~25)을 입력해주세요.>");
		choice = Integer.parseInt(sc.nextLine());
		
		
		int select[] =  new int[choice] ;
				for(int i=0;i<choice;i++){
					random = (int)(Math.random()*100/4)+1;//1~25생성
					select[i] = student[random-1];
					
					//중복제거
					for(int j=0;j<i;j++){
							if(select[j] == random){
								i--;
								break;
							}
						}
					
			
				
				}
		System.out.println(Arrays.toString(select));

	}

}
