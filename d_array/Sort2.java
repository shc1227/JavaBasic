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
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[j]>arr[j+1]){
					
				}
			}
		}
		
		
		
	}
}
