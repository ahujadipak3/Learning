package thread;

import java.util.List;

public class Consumer implements Runnable {

	List<Integer> items;
	public Consumer(List<Integer> items) {
		this.items = items;
	}

	public void run() {
		for(int i=0;i<20000;i++) {
			/* System.out.println("Producer printing: "); */ 
			this.items.add(i);		}
	}
}
