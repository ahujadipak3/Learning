package thread;

public class ThreadSample extends Thread{

	public static void main(String[] args) {
		
		
		Thread t = new ThreadSample();
		t.start();
		//t.start();
		
		Thread runnableThread = new Thread(() -> {
			System.out.println("IN runnable Thread");
		});
		runnableThread.start();
	}
	
	public void run() {
		System.out.println("In run method");
	}
	
}
