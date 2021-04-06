package J_collection;

import java.awt.image.RescaleOp;
import java.util.ArrayList;

public class Score {

	public static <E> void main(String[] args) {
		/*
		 * 우리반 모두의 국어,영어 수학, 사회,과학,Oracle,java점수를
		 * 0~100사이의 랜덤값을 생성해 주시고 ,아래와 같이 출력해주세요.
		 * 
		 * 이름	국어	영어	수학	사회	과학	Oracle	java	합계	평균	석차
		 * 홍길동
		 * 
		 * 
		 */
		int ran;
		ArrayList<ArrayList<String>> count = new ArrayList<>();
		ArrayList<String> score = new ArrayList<>(); 
		ArrayList<String> name = new ArrayList<>();
		
		for(int j=0;j<25;j++){
			name.add(j,"a"+(j+1));
			score = new ArrayList<>();
			for(int i=0;i<7;i++){
				score.add(i,String.valueOf((int)(Math.random()*101)));
			}
			count.add(score);
		}
		

		//합계 ,//평균
		ArrayList<String> sumRes = new ArrayList<>();
		ArrayList<String> avgRes = new ArrayList<>();
		double avg;
		
		
		
		for(int i=0;i<count.size();i++){
			int sum =0;
			
			for(int j=0;j<score.size();j++){
				sum=sum+Integer.parseInt(count.get(i).get(j));
				
				
			}
			avg=Math.round(sum/(double)score.size()*10)/10.0;
			sumRes.add(String.valueOf(sum));
			avgRes.add(String.valueOf(avg));
		}
		
		
		
		
		ArrayList<String> sumSres = new ArrayList<>();
		ArrayList<String> avgSres = new ArrayList<>();
		double savg;
		
		
		
		for(int i=0;i<score.size();i++){
			int ssum =0;
			
			for(int j=0;j<count.size();j++){
				ssum=ssum+Integer.parseInt(count.get(j).get(i));
				
				
			}
			savg=Math.round(ssum/(double)count.size()*10)/10.0;
			sumSres.add(String.valueOf(ssum));
			avgSres.add(String.valueOf(savg));
		}
		
		//석차
		ArrayList<String> rank = new ArrayList<>();
		
		for(int i=0;i<sumRes.size();i++){
			int cnt =1;
			for(int j=0;j<sumRes.size();j++){
				if(
						Integer.parseInt(sumRes.get(i))<
						Integer.parseInt(sumRes.get(j))
						){
					cnt++;
				}
				
			}
			rank.add(String.valueOf(cnt));
		}
		//석차
//				for(int i=0;i<sum.length;i++){
//					count=1;
//					for(int j=0;j<sum.length;j++){
//					if(sum[i]<sum[j]){
//						count++;
//						}
//					rank[i]=count;
//					}
//				}
		
		//출력
		ArrayList<String> sj = new ArrayList<>(); 
		sj.add("이름");
		sj.add("국어");
		sj.add("영어");
		sj.add("수학");
		sj.add("사회");
		sj.add("과학");
		sj.add("Oracle");
		sj.add("Java");
		sj.add("합계");
		sj.add("평균");
		sj.add("석차");
		
		
		for(int i=0;i<sj.size();i++){
			System.out.print(sj.get(i)+"\t");
		}
		System.out.println();
		
		for(int i=0;i<name.size();i++){
			
			System.out.print(name.get(i)+"\t");
		
			for(int j=0;j<count.get(i).size();j++){
				System.out.print(count.get(i).get(j)+"\t");
			}
			System.out.print(sumRes.get(i)+"\t");
			System.out.print(avgRes.get(i)+"\t");
			System.out.print(rank.get(i)+"\t");
			System.out.println();
		}
		System.out.print("과목합계\t");
		for(int i=0;i<score.size();i++){
		System.out.print(sumSres.get(i)+"\t");
		}
		System.out.println();
		System.out.print("과목평균\t");
		for(int i=0;i<score.size();i++){
			System.out.print(avgSres.get(i)+"\t");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}
