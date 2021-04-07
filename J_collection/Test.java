package J_collection;

import java.util.ArrayList;

public class Test {
	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> ranks = new ArrayList<>();
		
		ranks.add(10);
		ranks.add(8);
		ranks.add(6);
		ranks.add(4);
		ranks.add(2);
		ranks.add(1);
		ranks.add(3);
		ranks.add(5);
		ranks.add(7);
		ranks.add(9);
		
		for(int i = 0; i < ranks.size(); i++) {
			int min = i;
			System.out.print("[ ");
			for(int j = i + 1; j < ranks.size(); j++) {
				System.out.print(ranks.get(j)+", ");
				if(ranks.get(j) < ranks.get(min)) {
					min = j;
				}
				
			}
			System.out.println("]");
			System.out.print(min+" -> ");
			
			int tempRank = ranks.get(i);
			ranks.set(i, ranks.get(min));
			ranks.set(min, tempRank);
		}
		
		for(int i = 0; i < ranks.size(); i++) {
		
			System.out.print(ranks.get(i));
			
			if(i == ranks.size() -1){
				System.out.print("");
			}
			else{
				System.out.print(", ");
			}
		}
		
	}
}
