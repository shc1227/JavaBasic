package e_oop.score;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		
		
		
		for(int i = 0;i<students.length;i++){
			
			Student st = new Student();
			st.name = "학생" + (i+1);
			
			st.kor=(int)(Math.random()*101);
			st.eng=(int)(Math.random()*101);
			st.math=(int)(Math.random()*101);
			st.sum = st.kor+st.eng + st.math;
			st.avg =Math.round(st.sum/3.0*100)/100.0; 
			st.rank = 1;

			
			
			students[i] = st;
			
			
		}
		for(int i = 0;i<students.length;i++){
			Student st = new Student();
			students[i].rank = 1;
		for(int j =0;j<students.length;j++){
			if(students[i].sum<students[j].sum){
				students[i].rank++;
			}
		}
	}
		Student temp;
		for(int i = 0;i<students.length-1;i++){
			int min = i;
			for(int j =i+1;j<students.length;j++){
				if(students[min].rank>students[j].rank){
					min = j;
				}
				
			}
			temp = students[min]; 
			students[min] =students[i];
			students[i] =temp;
		}
		
			//성적처리 프로그램을 완성해주세요
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t순위");
	
		for(int i =0;i<students.length;i++){
			
			System.out.print(students[i].name + " \t");
			System.out.print(students[i].kor+ " \t");
			System.out.print(students[i].eng+ " \t");
			System.out.print(students[i].math+ " \t");
			System.out.print(students[i].sum+ " \t");
			System.out.print(students[i].avg+ " \t");
			System.out.println(students[i].rank+ " \t");
			
		}
		
		
		
		
		
		
		
//		for(int i = 0;i<students.length;i++){
//				System.out.println(Arrays.toString(students));
//		}
			//합계
		
//			int stSum[] = new int[10];
//			double stAvg[] = new double[10];
//			int rank[] = new int [10];
//				for(int i =0;i<students.length;i++){
//					st.sum = st.kor+st.eng + st.math;
//					stSum[i] = st.sum;
//					st.avg = st.sum/3.0;
//					stAvg[i] = st.avg;
//					
//					for(int j =0;j<students.length;j++){
//						if(stAvg[i]<stAvg[j]){
//							rank[i]=st.rank++;
//							
//						}
//						
//					}
//					
//				}
				
				
//			//평균
//				st.avg = st.sum/3.0;
//			//랭크
//				for(int i =0;i<students.length;i++){
//					for(int j =0;j<students.length;j++){
//						
//				}
//		
//			
//			}
				
				
				
			 
	}
}
