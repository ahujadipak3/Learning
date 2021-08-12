package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ProducerConsumer {

	private List<Integer> items = new ArrayList<>();
	
	public void produce() {
		
		if(items.size()== 10 ) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//items.add(i++);
		
	}
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * List<Integer> items =new ArrayList<>(); Thread producer = new Thread(new
	 * Producer(items)); Thread consumer = new Thread(new Consumer(items));
	 * 
	 * producer.start(); consumer.start();
	 * 
	 * 
	 * try { producer.join(); consumer.join(); } catch (InterruptedException e) {
	 * e.printStackTrace(); }
	 * 
	 * try { Thread.sleep(20000); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * System.out.println(items.size()); }
	 */
}
