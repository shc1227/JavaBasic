package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어,영어,수학 ,사회,과학,Oracle,Java 점수를
		 * 0~100사이의 핸덤값으로 생성해주시고 아래와 같이 출력해주세요.
		 * 
		 * 이름		국어		영어		수학		사회		과학		Oracle		Java	합계		평균		석차
		 * 홍길동		90		90		90		90		90		90			90		630		90		1
		 * 홍길동		90		90		90		90		90		90			90		630		90		1
		 * 홍길동		90		90		90		90		90		90			90		630		90		1
		 * 홍길동		90		90		90		90		90		90			90		630		90		1
		 * 홍길동		90		90		90		90		90		90			90		630		90		1
		 * 홍길동		90		90		90		90		90		90			90		630		90		1
		 * 과목합계	450		450		450		450		450		450			450	
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00		90.00
		 * 			
		 */	
		
		
		int scores[][] = new int[25][7];
		
		
		int sum[]= new int[25];
		double avg[] = new double[25];
		String name[] = new String[]{"강유진", "강지수","곽재우","구본성","권수연","김보영","김소희","김지수","백지혜","송유경","신희철",
		"심선주","오수연","윤희중","이경준","이석호","이승구","이여강","이영민","이영우","이용석","이정범","최기문","최소은","최윤지"};
		int rank[]=new int[25];
		int count = 1;
		
		//이름
		
		for(int i=0;i<scores.length;i++){
			for(int j=0;j<scores[i].length;j++){
				scores[i][j] =(int)(Math.random()*100)+1; 
				
			}
			System.out.println(Arrays.toString(scores[i]));
		}
//		 
		//합계 평균
		for(int i=0;i<scores.length;i++){
			for(int j=0;j<scores[i].length;j++){
				sum[i] +=scores[i][j];
				
				
			}
			avg[i] =(Math.round(sum[i]/(double)scores[i].length*100))/100.0;
			
			
		}
		
		
		//석차
		for(int i=0;i<sum.length;i++){
			count=1;
			for(int j=0;j<sum.length;j++){
			if(sum[i]<sum[j]){
				count++;
				}
			rank[i]=count;
			}
		}
		
		
		
		String res[][] = new String[25][11];
		
		
		
		
		//이름 넣기
		for(int i=0;i<25;i++){
			res[i][0]=name[i];
			
			
		}
		//점수 넣기
		for(int i=0;i<scores.length;i++){
			for(int j=0;j<scores[i].length;j++){
				
				res[i][j+1]=Integer.toString(scores[i][j]);
			}
			
			
		}
		//합계, 평균,석차
		for(int i=0;i<scores.length;i++){
			
			res[i][8]=Integer.toString(sum[i]);
			res[i][9]=Double.toString(avg[i]);
			res[i][10]=Integer.toString(rank[i]);
		}
		//마지막
		String[][] merge = new String[2][8];
		
		merge[0][0] = "과목합계";
		merge[1][0] = "과목평균";
		int sum2[] = new int[7] ;
		double avg2[] = new double[7] ;
		
		for(int i=0;i<7;i++){
			for(int j=0;j<25;j++){
				sum2[i] += scores[j][i];
			}
			avg2[i] =(Math.round(sum2[i]/25.0*100))/100.0;
		}
		System.out.println(Arrays.toString(sum2));
		System.out.println(Arrays.toString(avg2));
		
		for(int i=1;i<8;i++){
			
			merge[0][i]=Integer.toString(sum2[i-1]);
			
					
			
			merge[1][i]=Double.toString(avg2[i-1]);
		}
		
		
		//출력
		String w[] =new String[]{"이름","국어","영어","수학","사회","과학","Oracle","Java","합계","평균","석차"};
		for(int i=0;i<w.length;i++){
			System.out.print(w[i]+"\t");
			
		}
		System.out.println();
		for(int i=0;i<25;i++){
			for(int j=0;j<11;j++){
				System.out.print(res[i][j]+"\t");
			}
			
			System.out.println();
		}
		
		for(int i=0;i<2;i++){
			for(int j=0;j<8;j++){
				System.out.print(merge[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
