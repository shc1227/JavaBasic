package i_api.test;

public class StringSpeedTest {
	public static void main(String[] args) {
		
	
//	String str = "a";
//	long start = System.currentTimeMillis();
//	
//	for(int i=0;i<2000;i++){
//		str += "a";
//	}
//	
//	long end = System.currentTimeMillis();
//	System.out.println(end-start +"ms");
		StringBuffer sb = new StringBuffer("a");
		long start = System.currentTimeMillis();
		for(int i=0;i<2000000;i++){
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start +"ms");
	}//main
}
