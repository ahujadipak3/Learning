package java8.lambda;

public class ThisReferenceExample {
	
	public static void main(String[] args) {
		ThisReferenceExample r = new ThisReferenceExample();
		r.performProcess(10, i -> {
				System.out.println(i);
				//System.out.println(this);
			
		});
	}

	void performProcess(int i, Process p) {
		p.process(i);
	}
}

interface Process {
	void process(int i);
}