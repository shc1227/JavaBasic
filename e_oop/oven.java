package e_oop;

public class oven {
	
	
	boolean power; //전원
	int degree;
	int time;
	
	final int MIN_DEGREE = 0;
	final int MAX_DEGREE = 250;
	final int MIN_TIME = 0;
	final int MAX_TIME = 120;
	
	
	oven(){
		power = false;
		degree =0;
		time = 0;
	}

	
	void power(){
		power = !power;
		System.out.println(power ? "오븐 켜짐":"오븐 꺼짐");
	}
	void changeDegree(int degree){
		if(power){
			if(MIN_DEGREE <= degree &&  degree <= MAX_DEGREE  ){
				this.degree = degree;
			}
			System.out.println("온도. "+this.degree);
		}
	}
	
	
	void changeTime(int time){
		if(power){
			if(MIN_TIME <= time &&  time <= MAX_TIME  ){
				this.time = time;
			}
			System.out.println("시간. "+this.time);
		}
	}
	void degreeUp(){
		changeDegree(degree + 10);
	}
	void degreeDown(){
		changeDegree(degree - 10);
	}
	
	
	void timeUp(){
		changeTime(time + 1);
	}
	void timeDown(){
		changeTime(time - 1);
	}
	
	
	
	public static void main(String[] args) {
		oven o = new oven();
		
		while(true){
			System.out.println("-------------------------------");
			System.out.println("1.전원  2.온도변경  3.온도업  4.온도다운");
			System.out.println("5.시간설정  6.시간업 7.시간다운  0.종료");
			System.out.println("-------------------------------");
			System.out.print("번호 입력>");
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1: o.power(); break;
				
			case 2:
				System.out.print("변경할 온도 입력>");
				int de = ScanUtil.nextInt();
				o.changeDegree(de);
				break;
				
			case 3: o.degreeUp(); break;
			case 4: o.degreeDown(); break;
			case 5:
				System.out.print("변경할 시간 입력>");
				int ti = ScanUtil.nextInt();
				o.changeTime(ti);
				break;
			case 6: o.timeUp(); break;
			case 7: o.timeDown(); break;
				
			default:
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			}
		}
	}
	
}
