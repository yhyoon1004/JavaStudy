
public class Ex13_1 {
	public static void main(String[] args) {
		// thread를 상속 받는 쓰레드 구현
//		Thread1 th1 = new Thread1();
//		th1.start();
		Runnable r = new Thread2();
		Thread th2 = new Thread(r);

	}
}

class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println("-");
		}
	}
}

class Thread2 implements Runnable {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println("-");
		}
	}
}