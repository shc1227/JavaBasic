package d_array;

import java.awt.image.TileObserver;

public class Score3 {

	public static void main(String[] args) {
		/*

		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를

		 * 0 ~ 100까지 랜덤으로 생성해주시고, 아래와 같이 출력해주세요.

		 * 

		 * 이름		국어		영어		수학		사회		과학		Oracle	Java	합계		평균		석차

		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1

		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1

		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1

		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1

		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1

		 * 과목합계	450		450		450		450		450		450		450

		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00	90.00

		 */

		

		String[] names = {"강유진","강지수","곽재우","구본성","권수연",
						  "김보영","김소희","김지수","백지혜","송유경",
						  "신희철","심선주","오수연","윤희중","이경준",
						  "이석호","이승구","이여강","이영민","이영우",
						  "이용석","이정범","최기문","최소은","최윤지"};//25

		String title[] = new String[]{"이름","국어","영어","수학","사회","과학","Oracle","Java","합계","평균","석차"};//11
		int Scores[][] = new int[25][7];
		int sum [] = new int[Scores.length];
		double avg[] = new double[Scores.length];
		int rank[] = new int[Scores.length];
		
		
		for(int i=0;i<Scores.length;i++){
			for(int j=0;j<Scores[i].length;j++){
				Scores[i][j] = (int)(Math.random()*100)+1;
				System.out.print(Scores[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=0;i<Scores.length;i++){
			for(int j=0;j<Scores[i].length;j++){
				sum[i] +=Scores[i][j];
			}
				avg[i] =Math.round((double)sum[i]/Scores.length*100)/100;
		}
		
		
		for(int i=0;i<Scores.length;i++){
			rank[i] = 1;
			for(int j=0;j<Scores[i].length;j++){
				if(sum[i] < sum[j]){
					rank[i]++;
				}
			}
		}	

		
		
		System.out.println();
		System.out.println();
		
		//출력
		String res[][] = new String[25][11];
		
		for(int i=0;i<title.length;i++){
			System.out.print(title[i]+"\t");
		}
		
		for(int i=0;i<names.length;i++){
			res[i][0] = names[i];
		}
		
		for(int i=0;i<Scores.length;i++){
			for(int j=0;j<Scores[i].length;j++){
				res[i][j+1]=Integer.toString(Scores[i][j]);
				
				
			}
		}
		for(int i=0;i<Scores.length;i++){
			res[i][8] = Integer.toString(sum[i]);
			res[i][9] = Double.toString(sum[i]);
			res[i][10] = Integer.toString(rank[i]);
		}
		
		System.out.println();
		for(int i=0;i<res.length;i++){
			for(int j=0;j<res[i].length;j++){
				System.out.print(res[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
