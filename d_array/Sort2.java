package d_array;

import java.util.Arrays;

public class Sort2 {

	public static void main(String[] args) {
		
		//랜덤
		int[]arr = new int[5];
		for(int i = 0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		
		//선택정렬
		for(int i=0;i<arr.length-1;i++){
			int min=i;	
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min]){
					min=j;
					
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min]=temp;
		}
		
		
		System.out.println("선택정렬 :"+Arrays.toString(arr));
		
		
	}
}
