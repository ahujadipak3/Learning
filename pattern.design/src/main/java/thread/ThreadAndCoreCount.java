package thread;

public class ThreadAndCoreCount {

	public static void main(String[] args) {
		System.out.println(Thread.activeCount());
		System.out.println(Runtime.getRuntime().getClass());
		System.out.println("max: "+ Runtime.getRuntime().maxMemory());
		System.out.println(" total: "+ Runtime.getRuntime().totalMemory());
		System.out.println("free: "+ Runtime.getRuntime().freeMemory());
		System.out.println(" available processors: "+ Runtime.getRuntime().availableProcessors());
	}
}
