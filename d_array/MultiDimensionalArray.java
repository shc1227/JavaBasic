package d_array;

import java.awt.image.TileObserver;
import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		//2차원
		int[][] array2;
		
		//3차원
		int[][][] array3;
			
		
		int[][] arr = new int[2][3];
		/*
		 * 변수 = 주소1(100번지)
		 * 
		 * 100번지
		 * {주소2(200번지), 주소3(300번지)}
		 * 
		 * 200번지
		 * {0,0,0}
		 * 
		 * 300번지
		 * {0,0,0}
		 */
		
//		int arr2[][] = new int [][]{{1,2,3}};
//		int [] arr3[] = {{1,2,3},{4,5,6},{7,8,9}};
//		
//		int [][] arr4 = new int[3][]; //가변 배열
//		arr4[0] = new int []{1,2,3};
//		arr4[1] = new int [4];
//		arr4[2] = new int [10];
//		for(int i=0;i<arr4.length;i++){
//			for(int j=0;j<arr4[i].length;j++){
//		System.out.print(arr4[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
//		//arr[0] = 10;//값을 저장할 수 없다.
//		arr[0] = new int[5]; // 배열을 저장해야 한다.
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[1][0] = 100;
//			for (int i = 0; i < arr.length; i++) {
//				for (int j = 0; j < arr[i].length; j++) {
//					System.out.print(arr[i][j] + "\t");
//				}
//				System.out.println();
//			}
//		
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
		
//		for(int i=0;i<arr.length;i++){
//			for(int j=0;j<arr[i].length;j++){
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		//3명의 학생 5과목의 점수를 가지고 있다.합계와 평균을 구하시오.
//		int[][] scores = new int [3][5];
//		int[] sum = new int[scores.length];
//		double[] avg =new double[scores.length];
//		
//		for(int i=0;i<scores.length;i++){
//			for(int j=0;j<scores[i].length;j++){
//				scores[i][j] = (int)(Math.random()*100)+1;
//			}
//			System.out.println(Arrays.toString(scores[i]));
//		}
//		
//		//합계와 평균
//		for(int i=0;i<scores.length;i++){
//			for(int j=0;j<scores[i].length;j++){
//				sum[i] +=scores[i][j];
//				
//				
//			}
//			avg[i] =(Math.round(sum[i]/(double)scores[i].length*100))/100.0;
//			System.out.println("합계 :"+sum[i]+"/ 평균 :"+ avg[i]);
//		}

		int scores[][] = new int[6][4];
		
		int sum[]= new int[scores.length];
		double avg[]= new double[scores.length];
		int rank[] = new int[sum.length];
		
		
		for(int i =0;i<scores.length;i++){
			for(int j=0;j<scores[i].length;j++){
				scores[i][j]= (int)(Math.random()*100)+1;
			}
		}
		
		for(int i=0;i<scores.length;i++){
			for(int j=0;j<scores[i].length;j++){
				sum[i]+=scores[i][j];//sum[i] = sum[i] + scores[i][j];
				
			}
				avg[i] =(double)sum[i]/scores[i].length; 
		}
		for(int i=0;i<sum.length;i++){
			rank[i] =1;
			for(int j=0;j<sum.length;j++){
				if(sum[i]<sum[j]){
					rank[i]++; 
				}
			}
		}
		
		String title[] = {"국어","수학","사회","영어","합계","평균","석차"};
		
		
		
		for(int i=0;i<title.length;i++){
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<scores.length;i++){
			for(int j=0;j<scores[i].length;j++){
				System.out.print(scores[i][j]+"\t");
				
				
			}
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(rank[i]+"\t");
			System.out.println();
		}
		int sum2[] = new int[4];
		double avg2[] = new double[4];
		
//		System.out.println(scores.length);
//		System.out.println(scores[0].length);
		
		
		for(int i=0;i<scores[i].length;i++){
			for(int j=0;j<scores.length;j++){
				sum2[i] +=scores[j][i];
				
			}
				avg2[i] = (double)sum2[i]/scores.length;
				
				
		}
		
		
			for(int j=0;j<4;j++){
				System.out.print(sum2[j]+"\t");
			}
			System.out.println();
			for(int j=0;j<4;j++){
				System.out.print(avg2[j]+"\t");
			}
			
		
		
		
		
		
		
	}
}
