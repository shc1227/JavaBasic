
public class Find {
	public static void main(String[] args) {
	
		
		int[] not_ordered_arry = {4, 10, 5, 9, 2,1, 0, 13, 15};
		
		int index = Find.find_not_ordered_array(not_ordered_arry, 0);
		System.out.println("index : "+index);
		
		
		index = Find.find_not_ordered_array(not_ordered_arry, 20);
		System.out.println("index : "+index);
		
		
		
		
		int[] ordered_arry = {0,1,3,6,7,8,9,14,62,78,88};
		index = Find.find_not_ordered_array(ordered_arry, 6);
		System.out.println("index : "+index);
	}
	
	
	//첫번째 인자로 들어오는 배여레서
	//두번째 인자에 해당하는 값이 있을 경우 : 배열의 인덱스를 반환
//						값이 없을 경우 : -1을 리턴
	
	
	
	
	
	
	
	public static int find_not_ordered_array(int[] not_ordered_arry, int find){
		for(int i =0; i< not_ordered_arry.length;i++){
				if(find == not_ordered_arry[i]){
					return i;
				}
		}
	
		return -1;
	}
	
	
	public static int find_ordered_array(int[] ordered_arry, int find){
		for(int i =0; i< ordered_arry.length;i++){
				if(find == ordered_arry[i]){
					return i;
				}
		}
	
		return -1;
	}
	
}
