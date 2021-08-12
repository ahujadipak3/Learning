package thread;

import java.util.List;

public class Producer implements Runnable {

	List<Integer> items;
	public Producer(List<Integer> items) {
		this.items = items;
	}

	@Override
	public void run() {
		for(int i=0;i<20000;i++) {
			/* System.out.println("Producer printing: "); */ 
					if(this.items.size() == 10) {
						
					}
		}
	}

	
}
