package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
//		//거스름돈 동전 개수
//		int money = (int)(Math.random()*500)*10;
//		int [] coin = {500, 100, 50, 10};
//		System.out.println("거스름돈 : "+money);
		
		/*
		 * 거스름돈에 동전의 단위마다몇개의 동전이 필요한지 출력해주세요.
		 * 
		 * 거스름돈 : 2860원
		 * 500원 : 5개 -a
		 * 100원: 3개  -b
		 * 50원 : 1개   -c
		 * 10원 : 1개   -d
		 * 
		 * 
		 * 
		 */
		
		
		
		//내가한것
		
//		int hwn[] = new int[]{500,100,50,10};
//		int mok[] = new int[4];
//		
//		for(int i=0;i<hwn.length;i++){
//			mok[i]=money/hwn[i];
//			money=money - hwn[i]*mok[i];
//		}
//	
//		
//		System.out.println("500원 :"+mok[0]);
//		System.out.println("100원 :"+mok[1]);
//		System.out.println("50원 :"+mok[2]);
//		System.out.println("10원 :"+mok[3]);
		
		//선생님
		
//		for(int i=0;i<coin.length;i++){
//		int count = money/coin[i];
//		money = money%coin[i];
//		System.out.println(coin[i]+"원 : "+count +"개");
//		}
		
		
		
		
		//그래프 그리기
//		int[] arr= new int [20];
//		for(int i=0;i<arr.length;i++){
//			arr[i]=(int)(Math.random()*5)+1;
//		}
//		System.out.println(Arrays.toString(arr));
		
		/*
		 * 1~5사이의 숫자가 발생된 만큼 *을 사용해 그래프를 그려주세요.
		 * 
		 * [4,3,2,1,1,1,4,4,5,5,]
		 * 1: ***** 5
		 * 2: ****4
		 */

		
//				int [] count = new int[5];
//			
//			
//			for(int j=0;j<arr.length;j++){
//				for(int i=4;i>=0;i--){
//					if(arr[j]==i+1){
//						count[i]=count[i]+i+1;
//					}
//				}
//				
//			}
//			int res;
//			
//			for(int i=0;i<5;i++){
//				
//				res=count[i]/(i+1);
//				int m=i+1;
//				System.out.print("숫자 :"+m+"은\t");
//				for(int j=0;j<res;j++){
//				
//					
//					System.out.print("*");	
//					
//				}
//				System.out.print("\t"+res+"개");
//				System.out.println();
//			}
			
//			int[] counts = new int[5];
//			for(int i= 0;i<arr.length;i++){
//				counts[arr[i]-1]++;
//			}
//			for(int i=0;i<counts.length;i++){
//				System.out.print(i+1+" : ");
//				for(int j=0;j<counts[i];j++){
//					System.out.print("*");
//				}
//				System.out.println(" "+ counts[i]);
//			}
			
//			//중복되지 않는 배열
//			int[] arr = new int[10];
//			for(int i =0;i<arr.length;i++){
//				arr[i] = (int)(Math.random()*5)+1;
//			}
//			System.out.println(Arrays.toString(arr));
//			/*
//			 * 1~5사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제건된 배열을 만들어주세요.
//			 * [2, 5, 1, 3, 3, 3, 5, 3, 3, 5]
//			 * [2,5,1,3]
//			 */
//			
//			      
//			int[] temp = new int[5];
//			int count = 0;
//			for(int i=0;i<arr.length;i++){
//				boolean flag = true;
//				for(int j=0; j<temp.length;j++){
//					if(arr[i] == temp[j]){
//						flag = false;
//					}
//				}
//				if(flag){
//					temp[count++] = arr[i];
//					
//				}
//				
//			}
//		
//			int[] result = new int[count];
//			for(int i=0;i<result.length;i++){
//				result[i] = temp[i];
//			}
//			System.out.println(Arrays.toString(result));
		
		Scanner sc= new Scanner(System.in);
		int arr[] =new int[100];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		/*
		 * 2~5사이의 랜덤함 수로 나누어 떨어지는 숫자로만 이루어진 배열을 출력해주세요.
		 * 5
		 * [5,10,15,20,25,30]
		 * 
		 * 
		 */

//내가한것
//		int count=0;
//		int multiple[] =  new int[100];
//		System.out.println("[2 ~ 5]의 나눌 수를 입력해주세요>");
//		int divnum = sc.nextInt();
//		
//		for(int i = 0;i<arr.length;i++){
//			
//			if(arr[i]%divnum == 0){
//				count++;
//				multiple[count-1]=arr[i];
//			}
//		}
//		System.out.println(Arrays.toString(multiple));
//		int c = count;
//		if(count == 0){
//			c = 1;
//		}
//		int res[] =  new int[c];
//		for(int j=0;j<res.length;j++){
//			res[j]=multiple[j];
//		}
//		
//		System.out.println("개수 " +count);
//		
//		System.out.println(Arrays.toString(res));
		
//선생님이 한것
		int[] tempArr = new int[100];
		int n = (int)(Math.random() * 4) + 2;//2~5사이
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % n == 0){
				tempArr[count++] = arr[i]; //나누어 떨어지는 수 값을 넣어 줌
			}
		}
		
		int[] resultArr = new int[count];//카운트 만큼의 배열 만들기
		for(int i = 0; i < resultArr.length; i++){
			resultArr[i] = tempArr[i];
		}
		
		for(int i  = 0; i < resultArr.length - 1; i++){//선택정렬
			int min = i;
			for(int j = i + 1; j < resultArr.length; j++){
				if(resultArr[j] < resultArr[min]){
					min = j;
				}
			}
			int tmp = resultArr[i];
			resultArr[i] = resultArr[min];
			resultArr[min] = tmp;
		}
		System.out.println("n : " + n);
		System.out.println(Arrays.toString(resultArr));

		
		
	}

}
