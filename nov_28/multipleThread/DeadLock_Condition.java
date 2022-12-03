package multipleThread;


class Occupy{
	static void sleep(long ms) {
		try {
			Thread.sleep(ms);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	} 
}

class Friend{
	synchronized void test1(Friend f){
		System.out.println("Friend-test1 begin"); 
		Occupy.sleep(1000);
		f.test2(f);
		System.out.println("Friend-test1 ends");
	}
	synchronized void test2(Friend f1){
		System.out.println("Friend-test2 begin");
		Occupy.sleep(1000);
		System.out.println("Friend-test2 ends");
	}
	
	
}
class AccessThread extends Thread{
	private Friend f1,f2;
	public AccessThread(Friend f1, Friend f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	public void run() {
		f1.test1(f2);
	}
}

class AccessThread2 extends Thread{
	private Friend f1,f2;
	public AccessThread2(Friend f1, Friend f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	public void run() {
		f2.test1(f1);
	}
}

public class DeadLock_Condition {

	public static void main(String[]args) {
		Friend f1 = new Friend();
		Friend f2 = new Friend();
		AccessThread ac = new AccessThread(f1,f2);
		ac.start();
		AccessThread2 ac2 = new AccessThread2(f1,f2);
		ac2.start();
		Occupy.sleep(2000);
	}
	
}
