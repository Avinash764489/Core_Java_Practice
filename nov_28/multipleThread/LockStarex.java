package multipleThread;

public class LockStarex extends Thread {

	static int tc=1;
	public void run() {
		System.out.println(tc+" st child "+"Thread excecution start");
		System.out.println("ct ece comp");
		try {
			Thread.sleep(2000);
			tc=tc+1;
		}catch(Exception e) {
			
		}
	}
	public static void main(String arg[]) {
		System.out.println("Main thread execution starts");
		LockStarex ls1 = new LockStarex();
		ls1.setPriority(1);
		LockStarex ls2 = new LockStarex();
		ls2.setPriority(9);
		LockStarex ls3 = new LockStarex();
		ls3.setPriority(8);
		LockStarex ls4 = new LockStarex();
		ls4.setPriority(7);
		LockStarex ls5 = new LockStarex();
		ls5.setPriority(6);
		ls1.start();
		ls2.start();
		ls3.start();
		ls4.start();
		ls5.start();
		System.out.println("Main thread execution completes");
	}
}
