package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * 배열
		 * 	- 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 *  - 참조형 타입이다.
		 *  - 인덱스로 값을 구분한다.
		 *  - 길이를 변경 할 수 없다.
		 * 
		 */

//		int[] array;
//		array = new int[5]; //-->배열의 길이를 정해준다.(index==> X)/5개의 기본값 0이 들어가 있다.
		
		/*
		 * 변수 = 주소(100번지)
		 * 
		 * 100번지
		 * {0, 0, 0, 0, 0}==>{101번지,102번지,103번지,104번지,105번지}
		 * 
		 */
		
//		array = new int[]{1, 2, 3, 4, 5};//-->기본값이 아닌 {1,2,3,4,5}로 값이 저장되어있다.
		
		//array = {1, 2, 3, 4, 5};// 선언만 할수 없다 . 때문에 선언과 초기화를 동시에 진행하여야 한다.
		int[] array= {1, 2, 3, 4, 5};
		//[]값을 인덱스라고 한다.
		System.out.println(array[0]); 
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
			
		for(int i =0;i<array.length;i++){
			System.out.println(array[i]);
		}
		
		for(int i =0;i<array.length;i++){
			array[i] = (i + 1)* 10;
			System.out.println(array[i]);
		}
		
		
		
		//문제 10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요;
		
		int [] array3= new int[10];
		
		
		// 배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
		
		for(int i=0;i<array3.length;i++){
			array3[i]=(int)(Math.random()*100)+1;
			System.out.println("array3["+i+"] = "+array3[i]);
		}
		
		
		//배열에 저장된 모든 값의 합계 와 평균을 출력해주세요.
		int sum =0;
		for(int i=0;i<array3.length;i++){
			sum+=array3[i];
		}
		double avg=(double)sum/array3.length;
		System.out.println("합계 :"+sum+" ,평균 : "+avg);
		
		//배열에 저장된 값을 중 최소값과 최대값을 출력해주세요.
		//내가 한것
		System.out.println(Arrays.toString(array3));
		int []tp = {0};
		for(int j=0;j<array3.length;j++){
			for(int i=1;i<array3.length;i++){
				if(array3[i-1]>=array3[i]){
					tp[0]=array3[i];
					array3[i]=array3[i-1];
					array3[i-1]=tp[0];
				}
			}
		}
		System.out.println(Arrays.toString(array3));
		System.out.println("최소값 : "+array3[0]+", 최대값 : "+array3[9]);
		
		//검색에서 찾은 것
		int arr[] = {4,4,8,4,5,8,5,7,7,5};
		
		int max =arr[0]; //최대값
		int min =arr[0]; //최소값
		
		for(int i=0;i<arr.length;i++) {
		    if(max<arr[i]) {
			//max의 값보다 arr[i]이 크면 max = arr[i]
			max = arr[i];
		    }
					
		    if(min>arr[i]) {
			//min의 값보다 arr[i]이 작으면 min = arr[i]
			min = arr[i];
		    }
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
				
		
		
		//배열의 값을 섞어주세요.
		int []shuffle = new int [10];
		for(int i=0;i< shuffle.length;i++){
			shuffle[i] = i +1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		for(int i=0;i<shuffle.length*10;i++){
		
		int random = (int)(Math.random()*shuffle.length);
		int temp = shuffle[0];
		shuffle[0] = shuffle[random];
		shuffle[random] = temp;
		}
		System.out.println(Arrays.toString(shuffle));
	
		
		//1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		
		int ooo[]=new int[500];
		int count[] = new int[10];
		
		
		for(int i=0;i<ooo.length;i++){
			 ooo[i]= (int)(Math.random()*10)+1;
			 
			 for(int j=0;j<=9;j++){
				 if(ooo[i]== j+1 ){
					 count[j]++;
				 }
					 
			 }
		}
		
		for(int i=0;i<count.length;i++){
			System.out.println(i+1+"이 생성된 횟수 : "+count[i]);
			
		}
		
		
		//선생님이한것
		int counts[] = new int[10];
		

		for(int i=0;i<500;i++){
			int random = (int)(Math.random()*10)+1;
			 counts[random-1]++;
			
		}
		System.out.println(Arrays.toString(counts));
		
		
		
		
		
	}
}
