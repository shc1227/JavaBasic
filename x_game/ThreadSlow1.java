package x_game;

public class ThreadSlow1 {
	public static void main(String[] args) {
        SlowingThread th = new SlowingThread();
        th.start(); // 스레드 시작
    }


}
class SlowingThread extends Thread {
    
    public void run() {
        int ThreadSpeedSet = 1000; // 스레드 초기 속도 설정: 0
        while(true) {
            try {
                sleep(ThreadSpeedSet);    
            } catch (InterruptedException e) { return; }
        }
    }
}


