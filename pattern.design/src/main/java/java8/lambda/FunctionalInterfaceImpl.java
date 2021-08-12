package java8.lambda;

import java.lang.annotation.Annotation;

public class FunctionalInterfaceImpl implements FunctionalInterfaceSample{

	public static void main(String[] args) {
		FunctionalInterfaceSample f = new FunctionalInterfaceSample() {
			
			@Override
			public void display(String message) {
				// TODO Auto-generated method stub
				System.out.println("Hello, I am an interface method");
			}
		};
		
		final String messsage1 =  "Hello, I am called from Lambda";
		
		FunctionalInterfaceSample f1 = (messsage2) -> {System.out.println(messsage2);};
		f1.display("testing");
		
		FunctionalInterfaceImpl f2 = new FunctionalInterfaceImpl();
		
		/* f1.d */
		
		System.out.println();
	
		f1.display("");
		System.out.println(f1.var1);
		f2.display4("");
		//AbstractClassSample ab = new Abst
		//f2.display2(message);
	}
	
	
	static void display2(String message) {
		System.out.println("display 3");
	}


	@Override
	public void display(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display4(String message) {
		// TODO Auto-generated method stub
		System.out.println("display 4");
	}
}
