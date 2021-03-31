package g_oop2;

public class Time {//클래스
	
	
	private int hour;//변수
	private int minute;
	private int second;
	
	public int getHour() {//get 불러오기
		return hour;
	}

	public void setHour(int hour) {//set 저장하기
		
			this.hour = hour;
			if(hour <0){
				this.hour =0;
			}else if(hour >23 ){
				this.hour = 23;
				this.hour = hour%24;
			}else{
				this.hour = hour;
			}
		
		
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		
			this.minute = minute;
			if(minute <0){
				this.minute =0;
			}else if(59<minute){
				//this.hour = 59;
				this.minute = minute%60;
				setHour(this.hour + minute/60);
			}else {
				this.minute = minute;
			}
		
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		
			this.second = second;
			if(second <0){
				this.second =0;
			}else if(59<second){
				//this.second =59;
				this.second =second%60;
				setMinute(this.minute + second/60);
			}else{
				this.second = second;
			}
	}

	String getTime(){//메서드
		return hour + ":" + minute+":"+second;
	}
	
	
	
	
	void clock(){
		while(true){
			System.out.println(getTime());
			stop(1000);
			setSecond(second+1);
		}
	}
	
	private void stop(int interval){
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
