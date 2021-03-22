package d_array;

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
		
		int arr2[][] = new int [][]{{1,2,3}};
		int [] arr3[] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int [][] arr4 = new int[3][]; //가변 배열
		arr4[0] = new int [3];
		arr4[1] = new int [4];
		arr4[2] = new int [10];
		//System.out.println(arr[0][1]);
		
		
		//arr[0] = 10;//값을 저장할 수 없다.
		arr[0] = new int[5]; // 배열을 저장해야 한다.
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 100;
		
		
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
		
//		for(int i=0;i<arr.length;i++){
//			for(int j=0;j<arr[i].length;j++){
//				System.out.println(arr[i][j]);
//			}
//			
//		}
		//3명의 학생 5과목의 점수를 가지고 있다.합계와 평균을 구하시오.
		int[][] scores = new int [3][5];
		int[] sum = new int[scores.length];
		double[] avg =new double[scores.length];
		
		for(int i=0;i<scores.length;i++){
			for(int j=0;j<scores[i].length;j++){
				scores[i][j] = (int)(Math.random()*101);
			}
			System.out.println(Arrays.toString(scores[i]));
		}
		
		//합계와 평균
		for(int i=0;i<scores.length;i++){
			for(int j=0;j<scores[i].length;j++){
				sum[i] +=scores[i][j];
				
				
			}
			avg[i] =(Math.round(sum[i]/(double)scores[i].length*100))/100.0;
			System.out.println("합계 :"+sum[i]+"/ 평균 :"+ avg[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
